package facade_pattern;

/*

    The Facade pattern provides a unified interface to a set of interfaces
    in a subsystem e.g Invectory,Payment, Shipping interfaces.
    It defines a higher-level interface that makes the subsystem easier to use.
    The pattern is used to hide the system complexity from the client.

    Note we should not enforce the client to use facade, it should be able to
    use the individual interfaces directly

    The advantage of the Facade Pattern is that when changes are made we will
    not need to change anything on the client end; Like when an additional step
    is added the client doesn't need to be changed. In the below code we can easily add
    a Packaging interface without the client code changing.

 */
public class OrderServiceFacadeImpl implements OrderServiceFacade {
    public boolean placeOrder(int pId) {

        boolean orderFulfilled = false;

        Product product = new Product();

        product.productId = pId;

        if (InventoryService.isAvailable(product)) {

            System.out.println("Product with ID: " + product.productId + " is available.");

            boolean paymentConfirmed = PaymentService.makePayment();

            if (paymentConfirmed) {

                System.out.println("Payment confirmed...");

                System.out.println("Send invoice for payment");

                InvoiceService.sendInvoice("johndoe@gmail.com");

                ShippingService.shipProduct(product);

                System.out.println("Product shipped...");

                orderFulfilled = true;
            }
        }

        return orderFulfilled;
    }
}