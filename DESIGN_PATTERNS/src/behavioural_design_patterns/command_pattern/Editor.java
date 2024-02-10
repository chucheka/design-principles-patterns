package behavioural_design_patterns.command_pattern;

/* The editor class has actual text editing operations. It plays
 the role of a receiver: all commands end up delegating
 execution to the editor's methods.

 */
public class Editor {

    public String text;

    public String getSelection() {

        System.out.println("Returns selected text on the editor");
        System.out.println("The selected text is held in clipboard");

        return text;
    }

    public void deleteSelection() {

        System.out.println("Delete selected text on the editor");
    }

    public void replaceSelection(String text) {

        this.text = text;

        System.out.println("Insert the clipboard's contents at the current position");
    }
}
