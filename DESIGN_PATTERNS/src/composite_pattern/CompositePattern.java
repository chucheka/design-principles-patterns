package composite_pattern;

/*
    The Composite pattern lets you run a behavior recursively over all
    components of an object tree.

    A real-world example is a military structure:
    Armies of most countries are structured as hierarchies. An
    army consists of several divisions; a division is a set of
    brigades, and a brigade consists of platoons, which can be
    broken down into squads. Finally, a squad is a small group of
    real soldiers. Orders are given at the top of the hierarchy and
    passed down onto each level until every soldier knows what
    needs to be done

    Usage
    Use the pattern when you want the client code to treat both
    simple and complex elements uniformly.
 */
public class CompositePattern {


    public static void main(String[] args) {

        Entity employee1 = new Employee("Ucheka Chike", 100000);
        Entity employee2 = new Employee("John Doe", 50000);
        Entity employee3 = new Employee("Will Smith", 600000);
        Entity employee4 = new Employee("Angelina Jolie", 300000);

        Department itDepartment = new Department("IT Department");
        Department networkTeam = new Department("Network Department");
        Department engineering = new Department("Engineering Department");

        networkTeam.addEntity(employee1);
        networkTeam.addEntity(employee4);

        engineering.addEntity(employee3);

        itDepartment.addEntity(networkTeam);
        itDepartment.addEntity(engineering);

        Department hrDepartment = new Department("HR Department");

        hrDepartment.addEntity(employee2);

        Department company = new Department("Interswitch Group");

        company.addEntity(itDepartment);
        company.addEntity(hrDepartment);

        System.out.println("THE TOTAL SALARY OF EMPLOYEES IN THE IT DEPARTMENT " + itDepartment.getSalary());
        System.out.println("THE TOTAL SALARY OF EMPLOYEES IN THE COMPANY " + company.getSalary());

    }

}
