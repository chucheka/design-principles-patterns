package behavioural_design_patterns.command_pattern;

public class CutCommand extends Command {

    public CutCommand(MSWordApp app, Editor editor) {
        super(app, editor);
    }

    // The cut command does change the editor's state, therefore
    // it must be saved to the history. And it'll be saved as
    // long as the method returns true.
    public boolean execute() {
        saveBackUp();
        app.clipboard = editor.getSelection();
        editor.deleteSelection();
        return true;
    }
}
