package labs.patterns.creational.factory;

import labs.patterns.creational.factory.entities.Pizza;
import labs.patterns.creational.factory.entities.PizzaFactory;

public class App {
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.createPizza("Tuna");
        System.out.println(pizza.getIngredients());
        System.out.println(pizza.getPrice() + "kr");
    }
}
