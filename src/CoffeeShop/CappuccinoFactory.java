package CoffeeShop;

public class CappuccinoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new CappuccinoCoffee();
    }
}
