package labs.patterns.structural.facade.facades;

import labs.patterns.structural.facade.enteties.Pizza;

public class Oven {
    void preHeat() {
        System.out.println("Preheat the oven");
    }

    void bake(Pizza pizza) {
        System.out.println("Bake the pizza");
    }
}
