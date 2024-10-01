package CoffeeShop;

public class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new coffeeshop.EspressoCoffee();
    }
}
