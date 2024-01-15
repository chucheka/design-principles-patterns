package factory_method.logistics;

public abstract class LogisticsProvider {

    public void planDelivery() {
        System.out.println("Planning delivery of goods");
    }

    public abstract Transport createTransport();

}
