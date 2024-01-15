package abstract_factory.GUIFactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a button");
    }
}
