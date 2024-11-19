package LowLevelDesign.Creational.FactoryMethod;

public class NotificationFactory {
    /**
     *
     * @param notificationType the type of notification (EMAIL, SMS, PUSH)
     * @return a Notification object corresponding to the type, or null if the type is invalid
     */
    public static Notification getNotification(String notificationType) {
        if (notificationType == null) {
            return null;
        }
        if (notificationType.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (notificationType.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }

        return null;
    }
}
