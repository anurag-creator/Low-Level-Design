package LowLevelDesign.Creational.FactoryMethod;

public class Main {
    public static void main(String args[]){
        Notification email = NotificationFactory.getNotification("EMAIL");
        email.notifyUser("Your order has been shipped!");

        // Create an SMS Notification
        Notification sms = NotificationFactory.getNotification("SMS");
        sms.notifyUser("Your package is out for delivery!");

        // Create a Push Notification
        Notification push = NotificationFactory.getNotification("PUSH");
        push.notifyUser("You have a new message in your inbox!");
    }
}
