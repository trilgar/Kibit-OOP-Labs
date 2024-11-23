package lab4.task1.paymentprocessor;

public class PaymentProcessor {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.05;
        } else if (customerType.equals("Premium")) {
            return amount * 0.10;
        } else {
            return 0;
        }
    }
}
