package abstract_factory.GUIFactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a button");
    }
}
