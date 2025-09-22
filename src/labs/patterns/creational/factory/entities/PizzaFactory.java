package labs.patterns.creational.factory.entities;

import labs.patterns.creational.factory.concrete.CheesePizza;
import labs.patterns.creational.factory.concrete.HamPizza;
import labs.patterns.creational.factory.concrete.TunaPizza;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        switch (type) {
            case "Cheese":
                return new CheesePizza();
            case "Ham":
                return new HamPizza();
            case "Tuna":
                return new TunaPizza();
            default:
                return new DefaultPizza();
        }
    }
}
