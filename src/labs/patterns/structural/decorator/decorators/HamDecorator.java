package labs.patterns.structural.decorator.decorators;

import labs.patterns.structural.decorator.enteties.Pizza;

import java.util.ArrayList;
import java.util.List;

public class HamDecorator extends ToppingsDecorator {
    private final double hamPrice = 5.0;

    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.hamPrice;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>(super.getIngredients());
        ingredients.add("Ham");
        return ingredients;
    }

}
