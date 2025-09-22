package labs.patterns.creational.factory.concrete;

import labs.patterns.creational.factory.entities.Pizza;

import java.util.List;

public class HamPizza implements Pizza {
    @Override
    public double getPrice() {
        return 20.0;
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Ham", "Cheese");
    }
}
