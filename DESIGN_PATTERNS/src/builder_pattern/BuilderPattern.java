package builder_pattern;

import builder_pattern.computer_builder.Computer;
import builder_pattern.house_builder.ConcreteHouseBuilder;
import builder_pattern.house_builder.ConstructionEngineer;
import builder_pattern.house_builder.House;
import builder_pattern.house_builder.HouseBuilder;

public class BuilderPattern {

    public static void main(String[] args) {

        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();

        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);

        House houseA = engineerA.constructHouse();

        System.out.println("House is: " + houseA);


        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }
}
