package builder_pattern.house_builder;

/*

    This is the Director which defines the order in which to execute the building steps
    while the builder provides the implementation for the steps

    Note: You may find the builder pattern being used without the director. The client can
    directly instantiate the builder and invoke the required methods to get a product for itself.
    This is a common antidote for telescoping constructors.

 */
public class ConstructionEngineer {
    private HouseBuilder houseBuilder;
    public ConstructionEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.paintHouse();
        this.houseBuilder.furnishHouse();
        return this.houseBuilder.getHouse();
    }
}