package liskov_subtitution_principle;

class PaymentGatewayResponse {
    String fingerprint;

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }
}