package liskov_subtitution_principle;

abstract class BaseBankCard implements IPaymentInstrument {
    // members like name, cardNumber etc. omitted
    // below dependencies will be injected at runtime
    IPaymentInstrumentValidator basicValidator;
    IFraudChecker fraudChecker;
    IPaymentGatewayHandler gatewayHandler;

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        basicValidator.validate();
    }

    @Override
    public PaymentResponse collectPayment() throws PaymentFailedException {
        PaymentResponse response = new PaymentResponse();
        try {
            fraudChecker.runChecks();
            PaymentGatewayResponse pgResponse = gatewayHandler.handlePayment();
            response.setIdentifier(pgResponse.getFingerprint());
        } catch (FraudDetectionException e) {
            // exception handling
        }
        return response;
    }
}