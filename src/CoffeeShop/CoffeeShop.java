package CoffeeShop;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private static CoffeeShop instance;
    private List<CoffeeOrder> orders;

    private CoffeeShop() {
        orders = new ArrayList<>();
    }

    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void takeOrder(CoffeeOrder order) {
        orders.add(order);
        System.out.println("Заказ принят: " + order);
    }
}
