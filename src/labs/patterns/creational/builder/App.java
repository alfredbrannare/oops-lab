package labs.patterns.creational.builder;

import labs.patterns.creational.builder.service.RestaurantService;

import java.util.List;

public class App {
    public static void main(String[] args) {
        RestaurantService pizza = new RestaurantService.Builder()
                .name("Ham Pizza")
                .ingredients(List.of("Ham", "Cheese"))
                .price(50.0)
                .build();

    }
}
