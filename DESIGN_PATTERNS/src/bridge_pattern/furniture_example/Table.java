package bridge_pattern.furniture_example;

public class Table extends FurnitureItem {

    private IMaterial material;

    public Table(IMaterial material) {
        super(material);
        this.material = material;
    }

    @Override
    public FurnitureItem assemble() {
        material.useMaterial();

        System.out.println("Assembling a table");
        return new Table(material);
    }

}