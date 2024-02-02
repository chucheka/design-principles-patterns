package decorator_pattern;

import java.util.Base64;

/*
    THE CONCRETE DECORATOR
 */
public class EncryptionDecorator extends InputOutputStreamDecorator {

    //THE WRAPPEE
    private InputOutputStream wrappee;

    public EncryptionDecorator(InputOutputStream inputOutputStream) {
        super(inputOutputStream);
        this.wrappee = inputOutputStream;
    }

    // 1. Encrypt passed data.
    // 2. Pass encrypted data to the wrappee's writeData method.
    @Override
    public void writeData(byte[] data) {

        byte[] encryptedData = encryptData(data);



        wrappee.writeData(encryptedData);
    }

    //Get data from the wrappee's readData method.
    // 2. Try to decrypt it if it's encrypted.
    // 3. Return the result.
    @Override
    public byte[] readData() {

        byte[] encryptedData = wrappee.readData();

        return decryptData(encryptedData);


    }

    public byte[] decryptData(byte[] encryptedData) {

        System.out.println("Decrypting data already read from wrappee");

        return Base64.getDecoder().decode(encryptedData);
    }

    public byte[] encryptData(byte[] data) {

        System.out.println("Encrypting data to be written into wrappee");

        return Base64.getEncoder().encode(data);
    }
}
