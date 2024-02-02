package decorator_pattern;


/*
    THE BASE DECORATOR
 */
public class InputOutputStreamDecorator implements InputOutputStream {

    private InputOutputStream inputOutputStream;

    public InputOutputStreamDecorator(InputOutputStream inputOutputStream) {
        this.inputOutputStream = inputOutputStream;
    }


    @Override
    public void writeData(byte[] data) {
        inputOutputStream.writeData(data);
    }

    @Override
    public byte[] readData() {
        return inputOutputStream.readData();
    }
}
