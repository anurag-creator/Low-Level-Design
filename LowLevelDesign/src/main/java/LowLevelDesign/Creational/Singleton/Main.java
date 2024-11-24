package LowLevelDesign.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        PaymentGateway paymentGateway = PaymentGateway.getInstance();

        // Create a payment request
        PaymentRequest request = new PaymentRequest("Alice", "Bob", 500.75);

        // Process the payment
        paymentGateway.processPayment(request);
    }
}
