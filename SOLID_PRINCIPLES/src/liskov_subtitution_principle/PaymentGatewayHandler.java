package liskov_subtitution_principle;

class PaymentGatewayHandler implements IPaymentGatewayHandler {
    // members omitted

    @Override
    public PaymentGatewayResponse handlePayment() throws PaymentFailedException {
        // send details to payment gateway (PG), set the fingerprint
        // received from PG on a PaymentGatewayResponse and return
        return new PaymentGatewayResponse();
    }
}