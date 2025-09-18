package labs.patterns.behavioral.command;
import labs.patterns.behavioral.command.AddNumberCommand;
import labs.patterns.behavioral.command.Command;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {
    public static void main() {
        List<Integer> numbers = new ArrayList<>();
        Stack<Command> undoStack = new Stack<>();

        numbers.add(5);

        AddNumberCommand addNumberCommand = new AddNumberCommand(numbers, 5);
        undoStack.push(addNumberCommand);

        if (!undoStack.isEmpty()) {
            Command cmd = undoStack.pop();
            cmd.undo();
        }
    }
}