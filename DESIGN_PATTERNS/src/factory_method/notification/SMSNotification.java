package factory_method.notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser(String username) {
        System.out.println("Sedning notification via SMS");
    }
}
