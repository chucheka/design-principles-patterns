package abstract_factory.GUIFactory;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Painting checkbox");
    }
}
