package factory_method.logistics;

public class SeaLogisticsProvider extends LogisticsProvider {
    @Override
    public Transport createTransport() {

        return new Ship();

    }
}
