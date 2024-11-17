package LowLevelDesign.Creational.FactoryMethod;

public class PushNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
