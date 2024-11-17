package LowLevelDesign.Creational.FactoryMethod;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}
