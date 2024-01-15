package builder_pattern.house_builder;

public class BuilderPattern {

    public static void main(String[] args) {

        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();

        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);

        House houseA = engineerA.constructHouse();

        System.out.println("House is: "+houseA);
    }
}
