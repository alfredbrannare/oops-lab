package labs.patterns.structural.decorator.enteties;

import java.util.List;

public class DefaultPizza implements Pizza {
    @Override
    public List<String> getIngredients() {
        return List.of("Cheese", "Tomato Sauce");
    }

    @Override
    public double getPrice() {
        return 60.0;
    }
}
