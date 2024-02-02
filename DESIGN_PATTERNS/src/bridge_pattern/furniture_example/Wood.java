package bridge_pattern.furniture_example;

public class Wood implements IMaterial {
    @Override
    public void useMaterial() {
        System.out.println("Using wood material for the furniture");
    }
}