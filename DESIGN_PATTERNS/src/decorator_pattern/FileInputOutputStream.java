package decorator_pattern;

import java.util.Arrays;

/*
    THE CONCRETE COMPONENT
 */
public class FileInputOutputStream implements InputOutputStream {

    private String filename;

    public FileInputOutputStream(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(byte[] data) {
        System.out.println("Writing data " + Arrays.toString(data) + " to file " + filename);
    }

    @Override
    public byte[] readData() {

        System.out.println("Reading data from file: " + filename);
        return new byte[0];
    }
}
