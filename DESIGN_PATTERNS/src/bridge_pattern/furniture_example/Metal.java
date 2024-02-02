package bridge_pattern.furniture_example;

public class Metal implements IMaterial {
    @Override
    public void useMaterial() {
        System.out.println("Using metal material for the furniture");
    }
}
