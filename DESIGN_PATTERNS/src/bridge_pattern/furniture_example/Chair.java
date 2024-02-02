package bridge_pattern.furniture_example;

public class Chair extends FurnitureItem {

    private IMaterial material;

    public Chair(IMaterial material) {
        super(material);
        this.material = material;
    }

    @Override
    public FurnitureItem assemble() {

        material.useMaterial();

        System.out.println("Assembling a chair");

        return new Chair(material);
    }
}
