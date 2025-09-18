package labs.patterns.behavioral.command;

import java.util.List;

public class AddNumberCommand implements Command {
    private List<Integer> numbers;
    private int number;

    public AddNumberCommand(List<Integer> numbers, int number) {
        this.numbers = numbers;
        this.number = number;
    }

    @Override
    public void undo() {
        numbers.remove(Integer.valueOf(number));
    }
}