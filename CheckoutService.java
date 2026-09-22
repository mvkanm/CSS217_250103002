public class CheckoutService {
    private final PaymentProcessor paymentProcessor;
    public CheckoutService(PaymentProcessor paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double price) {
        if (paymentProcessor.pay(price)) {
            System.out.println("Order successfully paid.");
        } else {
            System.out.println("Payment failed.");
        }
    }
}
