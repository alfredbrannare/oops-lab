package labs.patterns.creational.singleton;

import labs.patterns.creational.singleton.enteties.PizzaOrderService;

public class App {
    public static void main(String[] args) {
        PizzaOrderService.getInstance().addOrder("Ham Pizza");
    }
}
