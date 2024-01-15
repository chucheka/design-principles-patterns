package factory_method.logistics;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering through road");
    }
}
