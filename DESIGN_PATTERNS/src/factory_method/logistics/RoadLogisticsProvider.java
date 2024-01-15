package factory_method.logistics;

public class RoadLogisticsProvider extends LogisticsProvider {
    @Override
    public Transport createTransport() {

        return new Truck();

    }
}
