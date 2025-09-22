package labs.patterns.creational.abstractFactory.concrete;

import labs.patterns.creational.abstractFactory.enteties.Drink;
import labs.patterns.creational.abstractFactory.enteties.Pizza;
import labs.patterns.creational.abstractFactory.enteties.PizzaFactory;

public class AmericanFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new AmericanPizza();
    }

    @Override
    public Drink createDrink() {
        return new AmericanDrink();
    }
}
