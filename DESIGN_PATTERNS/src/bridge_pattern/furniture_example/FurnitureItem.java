package bridge_pattern.furniture_example;

public abstract class FurnitureItem {

    private IMaterial material;

    public FurnitureItem(IMaterial material) {
        this.material = material;
    }

    public abstract FurnitureItem assemble();
}
