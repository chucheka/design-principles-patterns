package liskov_subtitution_principle;

interface IPaymentGatewayHandler {
    PaymentGatewayResponse handlePayment() throws PaymentFailedException;
}