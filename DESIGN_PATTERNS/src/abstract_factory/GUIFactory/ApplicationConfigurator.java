package abstract_factory.GUIFactory;

public class ApplicationConfigurator {

    public static void main(String[] args) {

        GUIFactory factory = null;

        OSType OS = OSType.valueOf("WINDOWS");

        if (OS.equals(OSType.WINDOWS))
            factory = new WinFactory();

        else if (OS.equals(OSType.MAC))
            factory = new MacFactory();
        else
            throw new RuntimeException("OS type not supported");

        UIGenerator uiGenerator = new UIGenerator(factory);

    }
}
