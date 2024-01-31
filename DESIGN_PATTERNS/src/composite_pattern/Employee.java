package composite_pattern;

public class Employee extends Entity {
    public int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary; // Removed recursive call
    }
}