package decorator_pattern;

public interface InputOutputStream {

    void writeData(byte[] data);

    byte[] readData();

}
