import facade_pattern.OrderServiceFacade;
import facade_pattern.OrderServiceFacadeImpl;
import factory_method.logistics.*;
import factory_method.notification.Channel;
import factory_method.notification.Notification;
import factory_method.notification.NotificationHandler;

public class Main {


    public static void main(String[] args) {

        try {
            deliverGoods("AIR");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        NotificationHandler notificationHandler = new NotificationHandler();

        Notification notification = notificationHandler.createNotifcation(Channel.EMAIL);

        notification.notifyUser("chucheka");



    }

    public static void deliverGoods(String transportType) throws IllegalAccessException {

        LogisticsProvider logisticsProvider = null;

        if (transportType.equals("SEA")) {

            logisticsProvider = new SeaLogisticsProvider();

        } else if (transportType.equals("ROAD")) {

            logisticsProvider = new RoadLogisticsProvider();

        } else if (transportType.equals("AIR")) {

            logisticsProvider = new AirLogisticsProvider();

        } else {

            throw new IllegalAccessException("Logistic type not supported");
        }

        Transport transport = logisticsProvider.createTransport();

        transport.deliver();
    }


}