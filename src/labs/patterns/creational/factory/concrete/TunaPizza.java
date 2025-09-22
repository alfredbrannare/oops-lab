package labs.patterns.creational.factory.concrete;

import labs.patterns.creational.factory.entities.Pizza;

import java.util.List;

public class TunaPizza implements Pizza {
    @Override
    public double getPrice() {
        return 100.0;
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Tuna", "Cheese");
    }
}
