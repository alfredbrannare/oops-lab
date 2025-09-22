package labs.patterns.creational.builder.enteties;

import java.util.List;

public record Pizza(
        String name,
        List<String> ingredients,
        double price
) {
}
