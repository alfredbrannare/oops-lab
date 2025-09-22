package labs.patterns.structural.proxy;

import labs.patterns.structural.proxy.entities.Pizza;
import labs.patterns.structural.proxy.proxies.PizzaProxy;

public class App {
    public static void main(String[] args) {
        Pizza pizza = new PizzaProxy();
        System.out.println("Price: " + pizza.getPrice());
        System.out.println("Ingredients: " + pizza.getIngredients());
    }
}
