public class LegacyPaymentAdapter implements PaymentProcessor {
    private final LegacyPaymentGateway gateway;
    public LegacyPaymentAdapter(LegacyPaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public boolean pay(double amount) {
        int cents = (int) Math.round(amount * 100);
        String result = gateway.makePayment(cents);
        return result.equals("SUCCESS");
    }
}