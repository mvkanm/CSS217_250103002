public class LegacyPaymentGateway {
    public String makePayment(int amountInCents) {
        if (amountInCents <= 0) {
            return "ERROR";
        }
        System.out.println(
            "Legacy Gateway: processing "
            + amountInCents + " cents"
        );
        return "SUCCESS";
    }
}
