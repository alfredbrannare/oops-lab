package labs.patterns.structural.facade.facades;

import labs.patterns.structural.facade.enteties.Pizza;

public class PizzaFacade {
    Oven oven;
    IngredientsInventory inventory;
    DeliverySystem delivery;

    public PizzaFacade(Oven oven, IngredientsInventory inventory, DeliverySystem delivery) {
        this.oven = oven;
        this.inventory = inventory;
        this.delivery = delivery;
    }

    public void makeAndDeliverPizza(Pizza pizza) {
        if (inventory.checkIngredients(pizza)) {
            System.out.println("Ingredients available");
            oven.preHeat();
            oven.bake(pizza);
            delivery.deliver(pizza);
        } else {
            System.out.println("No ingredients");
            System.out.println("Pizza not delivered");
        }
    }
}
