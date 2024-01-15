package liskov_subtitution_principle;

public class PaymentFailedException extends RuntimeException {
    public PaymentFailedException() {
    }

    public PaymentFailedException(String message) {
        super(message);
    }
}
