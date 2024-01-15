package abstract_factory.GUIFactory;

public class UIGenerator {

    private GUIFactory factory;
    private Button button;

    private CheckBox checkBox;

    public UIGenerator(GUIFactory factory) {
        this.factory = factory;
        createUI();
        paint();
    }

    private void createUI() {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    private void paint() {
        button.paint();
        checkBox.paint();
    }
}
