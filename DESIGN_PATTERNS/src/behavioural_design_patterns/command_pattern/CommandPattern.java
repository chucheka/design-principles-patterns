package behavioural_design_patterns.command_pattern;

/*

 For the example of the Command Pattern, we will assume we're creating
 a text editor which can execute different commands via buttons,shortcuts
 or context menu. Lets say we have to carry out a save operation, we can do that
 via a save button on the Editor GUI, or through a shortcut, Crtl + S, or by selecting
 a save option in the context menu after right-clicking.If we were to implement this
 operation on subclasses of the buttons or shortcut we wouldn't be able to reuse the
 operation.

 Let assume we are building a Microsoft Word editor

 Usage

 (1) Use the Command pattern when you want to parametrize
     objects with operations.

 (2) Use the Command pattern when you want to queue operations,
     schedule their execution, or execute them remotely

 (3) Use the Command pattern when you want to implement
     reversible operations.

 */
public class CommandPattern {



    public static void main(String[] args) {

        // THE COMMAND INVOKER
        MSWordApp app = new MSWordApp();

        // THE COMMAND RECEIVER
        Editor editor = new Editor();

        // Let's assume the user press ctrl + c
        Command copyCommand = new CopyCommand(app, editor);

        // Let's assume the user click on a button to cut text
        Command cutCommand = new CutCommand(app, editor);

        // Lets assume the user selects "Paste" from the context menu
        Command pasteCommand = new PasteCommand(app, editor);

        Command undoCommand = new UndoCommand(app, editor);

        app.executeCommand(pasteCommand);
        app.executeCommand(cutCommand);
        app.executeCommand(undoCommand);
//        app.undo();
    }
}
