package LowLevelDesign.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        PaymentGateway paymentGateway = PaymentGateway.getInstance();

        // Create a payment request
        PaymentRequest request = new PaymentRequest("User1", "User2", 500.75);

        // Process the payment
        paymentGateway.processPayment(request);
    }
}
