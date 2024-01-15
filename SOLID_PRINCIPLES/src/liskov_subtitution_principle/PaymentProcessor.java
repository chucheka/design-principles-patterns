package liskov_subtitution_principle;

import java.util.Objects;

class PaymentProcessor {
    void process(Objects orderDetails, IPaymentInstrument paymentInstrument) {
        try {
            paymentInstrument.validate();
            PaymentResponse response = paymentInstrument.collectPayment();
            saveToDatabase(orderDetails, response.getIdentifier());
        } catch (Exception ex) {
            // exception handling
        }
    }

    void saveToDatabase(Objects orderDetails, String identifier) {
        // save the identifier and order details in DB
    }
}