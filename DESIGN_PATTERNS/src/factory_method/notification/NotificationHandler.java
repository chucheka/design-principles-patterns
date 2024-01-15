package factory_method.notification;

public class NotificationHandler {

    public Notification createNotifcation(Channel channel) {

        if (channel.equals(Channel.SMS)) {
            return new SMSNotification();
        } else if (channel.equals(Channel.EMAIL)) {
            return new EmailNotification();
        } else if (channel.equals(Channel.PUSH_NOTIFICATION)) {
            return new PushNotification();
        } else {
            throw new IllegalArgumentException("Unknown notification channel");
        }
    }
}
