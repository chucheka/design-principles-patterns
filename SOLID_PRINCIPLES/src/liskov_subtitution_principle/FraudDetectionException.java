package liskov_subtitution_principle;

public class FraudDetectionException extends RuntimeException {
    public FraudDetectionException() {
    }
    public FraudDetectionException(String message) {
        super(message);
    }
}
