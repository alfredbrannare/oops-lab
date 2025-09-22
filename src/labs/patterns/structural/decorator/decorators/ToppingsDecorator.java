package labs.patterns.structural.decorator.decorators;

import labs.patterns.structural.decorator.enteties.Pizza;

import java.util.List;

public abstract class ToppingsDecorator implements Pizza {
    protected final Pizza pizza;

    protected ToppingsDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public List<String> getIngredients() {
        return this.pizza.getIngredients();
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice();
    }
}
