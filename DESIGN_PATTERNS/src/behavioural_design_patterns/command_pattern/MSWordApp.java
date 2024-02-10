package behavioural_design_patterns.command_pattern;

import java.util.Stack;

public class MSWordApp {

    public String clipboard;

    public Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        if (command.execute())
            history.push(command);
    }

    public void undo() {

        Command command = history.pop();

        if (command != null)
            command.undo();

    }

}
