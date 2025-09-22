package labs.patterns.creational.abstractFactory.concrete;

import labs.patterns.creational.abstractFactory.enteties.Drink;

public class AmericanDrink implements Drink {
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String getName() {
        return "American Coffee";
    }
}
