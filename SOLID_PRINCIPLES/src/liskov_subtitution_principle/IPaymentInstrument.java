package liskov_subtitution_principle;

interface IPaymentInstrument  {
   public void validate() throws PaymentInstrumentInvalidException;
   public PaymentResponse collectPayment() throws PaymentFailedException;
}