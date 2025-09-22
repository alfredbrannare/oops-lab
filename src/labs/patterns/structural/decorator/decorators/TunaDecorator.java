package labs.patterns.structural.decorator.decorators;

import labs.patterns.structural.decorator.enteties.Pizza;

import java.util.ArrayList;
import java.util.List;

public class TunaDecorator extends ToppingsDecorator {
    private final double tunaPrice = 5.0;

    public TunaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.tunaPrice;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>(super.getIngredients());
        ingredients.add("Tuna");
        return ingredients;
    }

}
