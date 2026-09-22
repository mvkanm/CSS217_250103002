public class Main {
    public static void main(String[] args) {
        LegacyPaymentGateway legacyGateway =
            new LegacyPaymentGateway();
        PaymentProcessor adapter =
            new LegacyPaymentAdapter(legacyGateway);
        CheckoutService checkout = new CheckoutService(adapter);

        checkout.checkout(2);
        checkout.checkout(-10);
    }
}
