package labs.patterns.creational.factory.entities;

import java.util.List;

public class DefaultPizza implements Pizza {
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Cheese", "Ham");
    }
}
