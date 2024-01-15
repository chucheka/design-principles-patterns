import single_responsibility_principle.TextManipulator;
import single_responsibility_principle.TextPrinter;

public class Main {

    public static void main(String[] args) {
        TextManipulator textManipulator = new TextManipulator("Hello World");

        textManipulator.findWordAndDelete("W");

        TextPrinter textPrinter = new TextPrinter(textManipulator);

        textPrinter.printText();

    }

}