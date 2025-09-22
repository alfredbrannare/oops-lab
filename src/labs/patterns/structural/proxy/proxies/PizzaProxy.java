package labs.patterns.structural.proxy.proxies;

import labs.patterns.structural.proxy.entities.ExpensivePizza;
import labs.patterns.structural.proxy.entities.Pizza;

import java.util.List;

public class PizzaProxy implements Pizza {
    private Pizza realPizza;

    public PizzaProxy() {
        this.realPizza = null;
    }

    private Pizza getRealPizza() {
        if (realPizza == null) {
            realPizza = new ExpensivePizza();
        }
        return realPizza;
    }

    @Override
    public List<String> getIngredients() {
        return getRealPizza().getIngredients();
    }

    @Override
    public double getPrice() {
        return getRealPizza().getPrice();
    }
}
