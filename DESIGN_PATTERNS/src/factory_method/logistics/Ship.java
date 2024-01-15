package factory_method.logistics;


public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering through the sea");
    }
}