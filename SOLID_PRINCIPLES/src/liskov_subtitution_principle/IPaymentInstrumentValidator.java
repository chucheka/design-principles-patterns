package liskov_subtitution_principle;

interface IPaymentInstrumentValidator {
    void validate() throws PaymentInstrumentInvalidException;
}