package labs.patterns.creational.abstractFactory.concrete;

import labs.patterns.creational.abstractFactory.enteties.Drink;

public class ItalianDrink implements Drink {

    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public String getName() {
        return "Italian Coffee";
    }
}
