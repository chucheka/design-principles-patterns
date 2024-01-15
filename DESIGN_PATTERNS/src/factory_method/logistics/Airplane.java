package factory_method.logistics;

public class Airplane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering through air");
    }
}
