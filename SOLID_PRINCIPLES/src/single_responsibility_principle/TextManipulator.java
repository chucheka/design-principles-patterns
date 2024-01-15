package single_responsibility_principle;

public class TextManipulator {
    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

    /*
        Here this class has two responsibilities: manipulating and printing the text.
        The printText should be separated into its own class with the sole responsibilty
        of printing text
     */

//    public void printText() {
//        System.out.println(textManipulator.getText());
//    }
}