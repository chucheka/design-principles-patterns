package behavioural_design_patterns.command_pattern;

/*
    The base command class defines the common interface for all
    concrete commands.
 */
public abstract class Command {
    protected MSWordApp app;
    protected Editor editor;
    protected String backUp;

    public Command(MSWordApp app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void saveBackUp() {
        System.out.println("Make a backup of the editor's state");
        backUp = editor.text;
    }

    public void undo() {
        System.out.println("Restore the editor's state.");
        editor.text = backUp;
    }

    public abstract boolean execute();
}
