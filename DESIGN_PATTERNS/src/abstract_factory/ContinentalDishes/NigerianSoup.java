package abstract_factory.ContinentalDishes;

public class NigerianSoup implements Soup {
    @Override
    public void prepare() {
        System.out.println("Add water");
        System.out.println("Season the meat");
        System.out.println("Mix everything together");
        System.out.println("Your soup is ready");
    }
}
