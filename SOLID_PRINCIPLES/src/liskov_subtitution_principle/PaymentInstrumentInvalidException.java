package liskov_subtitution_principle;

public class PaymentInstrumentInvalidException extends RuntimeException {
    public PaymentInstrumentInvalidException() {
    }

    public PaymentInstrumentInvalidException(String message) {
        super(message);
    }
}
