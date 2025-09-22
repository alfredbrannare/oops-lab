package labs.patterns.structural.decorator;

import labs.patterns.structural.decorator.decorators.HamDecorator;
import labs.patterns.structural.decorator.decorators.ToppingsDecorator;
import labs.patterns.structural.decorator.decorators.TunaDecorator;
import labs.patterns.structural.decorator.enteties.DefaultPizza;
import labs.patterns.structural.decorator.enteties.Pizza;

public class App {
    public static void main(String[] args) {
        System.out.println("Default Pizza");
        Pizza pizza = new DefaultPizza();
        System.out.println(pizza.getIngredients());
        System.out.println(pizza.getPrice() + "kr");
        System.out.println();

        System.out.println("Tuna Pizza");
        Pizza tunaPizza = new TunaDecorator(pizza);
        System.out.println(tunaPizza.getIngredients());
        System.out.println(tunaPizza.getPrice() + "kr");
        System.out.println();

        System.out.println("Ham Pizza");
        Pizza hamPizza = new HamDecorator(pizza);
        System.out.println(hamPizza.getIngredients());
        System.out.println(hamPizza.getPrice() + "kr");
        System.out.println();

        System.out.println("Deluxe Pizza");
        Pizza deluxePizza = new HamDecorator(new TunaDecorator(pizza));
        System.out.println(deluxePizza.getIngredients());
        System.out.println(deluxePizza.getPrice() + "kr");


    }
}
