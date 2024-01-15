package abstract_factory.GUIFactory;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Painting checkbox");
    }
}
