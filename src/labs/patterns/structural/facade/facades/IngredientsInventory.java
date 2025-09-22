package labs.patterns.structural.facade.facades;

import labs.patterns.structural.facade.enteties.Pizza;

import java.util.ArrayList;
import java.util.List;

public class IngredientsInventory {
    private final List<String> ingredients = new ArrayList<>();

    public void addToInventory(List<String> ingredients) {
        this.ingredients.addAll(ingredients);
    }

    public void addToInventory(String ingredient) {
        this.ingredients.add(ingredient);
    }

    boolean checkIngredients(Pizza pizza) {
        if (pizza.getIngredients().stream().allMatch(this.ingredients::contains)) {
            return true;
        } else {
            return false;
        }
    }

}
