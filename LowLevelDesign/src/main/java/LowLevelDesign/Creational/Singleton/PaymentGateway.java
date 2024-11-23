package LowLevelDesign.Creational.Singleton;
public class PaymentGateway {
    private static PaymentGateway instance;

    private PaymentGateway() {
        // Private constructor to prevent direct instantiation
    }

    public static PaymentGateway getInstance() {
        if (instance == null) {
            instance = new PaymentGateway();
        }
        return instance;
    }

    public void processPayment(PaymentRequest request) {
      
    }
}
