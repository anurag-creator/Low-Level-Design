package LowLevelDesign.Creational.Singleton;

public class PaymentRequest {
    private final String payer;
    private final String payee;
    private final double amount;

    public PaymentRequest(String payer, String payee, double amount) {
        this.payer = payer;
        this.payee = payee;
        this.amount = amount;
    }
    public String getPayer() {
        return payer;
    }

    public String getPayee() {
        return payee;
    }

    public double getAmount() {
        return amount;
    }
    @Override
    public String toString() {
        return "PaymentRequest{" +
                "payer='" + payer + '\'' +
                ", payee='" + payee + '\'' +
                ", amount=" + amount +
                '}';
    }
}
