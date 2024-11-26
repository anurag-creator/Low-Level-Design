package LowLevelDesign.Creational.Singleton;
//making class singletonc
public class PaymentGateway {
    private static PaymentGateway instance;

    private PaymentGateway() {
        // Private constructor to prevent direct instantiation
    }

    // Thread-safe lazy initialization of singleton instance
    public static synchronized PaymentGateway getInstance() {
        if (instance == null) {
            instance = new PaymentGateway();
        }
        return instance;
    }

    // Method to process a payment
    public void processPayment(PaymentRequest request) {
        System.out.println("Processing payment...");
        System.out.println(request);
        System.out.println("Payment successfully processed!");
    }
}
