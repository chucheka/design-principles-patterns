package behavioural_design_patterns.command_pattern;

public class CopyCommand extends Command {


    public CopyCommand(MSWordApp app, Editor editor) {
        super(app, editor);
    }

    // The copy command isn't saved to the history since it
    // doesn't change the editor's state.
    public boolean execute() {
        app.clipboard = editor.getSelection();
        return false;
    }
}
