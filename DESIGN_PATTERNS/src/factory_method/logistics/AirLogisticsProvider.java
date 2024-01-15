package factory_method.logistics;

public class AirLogisticsProvider extends LogisticsProvider {
    @Override
    public Transport createTransport() {

        return new Airplane();

    }
}
