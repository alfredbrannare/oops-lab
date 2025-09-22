package labs.patterns.creational.singleton.enteties;

public class PizzaOrderService {
    private static PizzaOrderService instance;

    private PizzaOrderService() {
    }

    public static PizzaOrderService getInstance() {
        if (instance == null) {
            instance = new PizzaOrderService();
        }
        return instance;
    }

    public void addOrder(String pizzaName) {
        System.out.println("Order added: " + pizzaName);
    }
}
