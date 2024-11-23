package lab4.task1.paymentprocessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        double discount = paymentProcessor.calculateDiscount("Premium", 1000);
        System.out.println("Discount: " + discount);
    }
}
