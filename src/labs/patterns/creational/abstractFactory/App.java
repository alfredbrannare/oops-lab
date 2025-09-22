package labs.patterns.creational.abstractFactory;

import labs.patterns.creational.abstractFactory.concrete.ItalianFactory;
import labs.patterns.creational.abstractFactory.enteties.Drink;
import labs.patterns.creational.abstractFactory.enteties.Pizza;
import labs.patterns.creational.abstractFactory.enteties.PizzaFactory;

public class App {
    public static void main(String[] args) {
    PizzaFactory factory = new ItalianFactory();
    Pizza pizza = factory.createPizza();
    Drink drink = factory.createDrink();

    System.out.println("Ingredients: " + pizza.getIngredients());
    System.out.println("Drink name: " + drink.getName());
    }
}
