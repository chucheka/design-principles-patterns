package decorator_pattern;

/*
    THE CONCRETE DECORATOR
 */
public class CompressionDecorator extends InputOutputStreamDecorator {
    protected InputOutputStream wrappee;

    public CompressionDecorator(InputOutputStream inputOutputStream) {
        super(inputOutputStream);
        this.wrappee = inputOutputStream;
    }

    @Override
    public void writeData(byte[] data) {

        System.out.println("Compressing file");

        wrappee.writeData(data);
    }

    @Override
    public byte[] readData() {

        System.out.println("Decompressing file");

        return wrappee.readData();
    }
}