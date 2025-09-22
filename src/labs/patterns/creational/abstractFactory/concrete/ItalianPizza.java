package labs.patterns.creational.abstractFactory.concrete;

import labs.patterns.creational.abstractFactory.enteties.Pizza;

import java.util.List;

public class ItalianPizza implements Pizza {
    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Italian Cheese", "Tomatoes", "Mozzarella", "Mozarella", "Ham");
    }
}
