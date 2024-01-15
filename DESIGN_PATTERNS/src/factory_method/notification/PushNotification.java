package factory_method.notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser(String username) {
        System.out.println("Sending notification via Push Notification");
    }
}


