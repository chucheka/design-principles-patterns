package decorator_pattern;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*

    Decorator is a structural design pattern that lets you attach
    new behaviours to objects by placing these objects inside
    special wrapper objects that contain the behaviour

    In this example, the Decorator pattern lets you compress and
    encrypt sensitive data independently from the code that actually
    uses this data
    The application wraps the data source object with a pair of
    decorators. Both wrappers change the way the data is written
    to and read from the disk:
    (1) Just before the data is written to disk, the decorators encrypt
    and compress it. The original class writes the encrypted and
    protected data to the file without knowing about the change

    (2) Right after the data is read from disk, it goes through the same
    decorators, which decompress and decode it.

 */
public class DecoratorPattern {

    private static InputOutputStream inputOutputStream;

    private static String salaryRecord = "The salary record for the month of January 2024";

    private static String filename = "somefile.dat";

    public static void main(String[] args) {
/*
        inputOutputStream = new FileInputOutputStream(filename);
        inputOutputStream.writeData(salaryRecord.getBytes(StandardCharsets.UTF_8));
        // The target file has been written with plain data.

        inputOutputStream = new CompressionDecorator(inputOutputStream);
        inputOutputStream.writeData(salaryRecord.getBytes(StandardCharsets.UTF_8));
        // The target file has been written with plain data.
 */


        // OR

        inputOutputStream = new EncryptionDecorator(new FileInputOutputStream(filename));

        inputOutputStream.writeData(salaryRecord.getBytes(StandardCharsets.UTF_8));
        byte[] readData = inputOutputStream.readData();

        System.out.println("THE READ DATA" + Arrays.toString(readData));


//        inputOutputStream = new CompressionDecorator(new FileInputOutputStream(filename));
//
//        inputOutputStream.writeData(salaryRecord.getBytes(StandardCharsets.UTF_8));
//        inputOutputStream.readData();
    }
}
