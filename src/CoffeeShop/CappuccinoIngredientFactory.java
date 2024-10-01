package CoffeeShop;

public class CappuccinoIngredientFactory extends AbstractCoffeeIngredientFactory {
    @Override
    public Ingredient createMilk() {
        return new MilkIngredient();
    }

    @Override
    public Ingredient createSyrup() {
        return new SyrupIngredient();
    }
}
