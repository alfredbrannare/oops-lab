package labs.patterns.structural.proxy.entities;

import java.util.List;

public class ExpensivePizza implements Pizza {

    public ExpensivePizza() {
    System.out.println("Pizza is being prepared...");
    }

    @Override
    public double getPrice() {
        return 500.0;
    }

    @Override
    public List<String> getIngredients() {
        return List.of("24K Cheese",
                "Ruby Ham",
                "Sapphire Mushrooms",
                "Emerald Basil",
                "Moonstone Onions");
    }
}
