package facade_pattern;

public class FacadePattern {

    public static void main(String[] args) {

       OrderServiceFacade orderServiceFacade = new OrderServiceFacadeImpl();

        orderServiceFacade.placeOrder(123);
    }
}
