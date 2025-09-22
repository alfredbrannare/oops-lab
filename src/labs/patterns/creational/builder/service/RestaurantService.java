package labs.patterns.creational.builder.service;

import java.util.List;

public class RestaurantService {
    private final String name;
    private final List<String> ingredients;
    private final double price;


    private RestaurantService(String name, List<String> ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public static class Builder {
        private String name;
        private List<String> ingredients;
        private double price;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder ingredients(List<String> ingredients) {
            this.ingredients = ingredients;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public RestaurantService build() {
        return new RestaurantService(name, ingredients, price);
        }
    }
}
