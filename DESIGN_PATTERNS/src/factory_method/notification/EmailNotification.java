package factory_method.notification;


public class EmailNotification implements Notification {
    @Override
    public void notifyUser(String username) {
        System.out.println("Sending notification via Email");
    }
}