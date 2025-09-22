package labs.patterns.creational.abstractFactory.concrete;

import labs.patterns.creational.abstractFactory.enteties.Drink;
import labs.patterns.creational.abstractFactory.enteties.Pizza;
import labs.patterns.creational.abstractFactory.enteties.PizzaFactory;

public class ItalianFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new ItalianPizza();
    }

    @Override
    public Drink createDrink() {
        return new ItalianDrink();
    }
}
