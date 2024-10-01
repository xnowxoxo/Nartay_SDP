import CoffeeShop.*;
// Main.java

public class Main {
    public static void main(String[] args) {
        // Получение экземпляра кофейни
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        // Создание заказа на капучино
        CoffeeFactory cappuccinoFactory = new CappuccinoFactory();
        Coffee cappuccino = cappuccinoFactory.createCoffee();

        // Создаем заказ с использованием Builder
        CoffeeOrderBuilder cappuccinoBuilder = new CoffeeOrderBuilder(cappuccino);
        CoffeeOrder cappuccinoOrder = cappuccinoBuilder.addMilk().addSyrup().build();

        // Прием заказа
        coffeeShop.takeOrder(cappuccinoOrder);

        // Клонирование заказа
        try {
            CoffeeOrder clonedOrder = cappuccinoOrder.clone();
            System.out.println("Клонированный заказ: " + clonedOrder);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
