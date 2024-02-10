package behavioural_design_patterns.command_pattern;

public class PasteCommand extends Command {
    public PasteCommand(MSWordApp app, Editor editor) {
        super(app, editor);
    }

    // The copy command isn't saved to the history since it
    // doesn't change the editor's state.
    public boolean execute() {
        saveBackUp();
        editor.replaceSelection(app.clipboard);
        return true;
    }


}
