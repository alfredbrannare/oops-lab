package labs.patterns.structural.facade;

import labs.patterns.structural.facade.enteties.DefaultPizza;
import labs.patterns.structural.facade.facades.DeliverySystem;
import labs.patterns.structural.facade.facades.IngredientsInventory;
import labs.patterns.structural.facade.facades.Oven;
import labs.patterns.structural.facade.facades.PizzaFacade;

import java.util.List;

public class App {
    public static void main(String[] args) {
        IngredientsInventory inventory = new IngredientsInventory();
        inventory.addToInventory(List.of("Cheese", "Tomato Sauce"));

        PizzaFacade pizzaFacade = new PizzaFacade(new Oven(), inventory, new DeliverySystem());
        pizzaFacade.makeAndDeliverPizza(new DefaultPizza());
    }
}
