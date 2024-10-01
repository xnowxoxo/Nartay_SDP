package CoffeeShop;

public class EspressoIngredientFactory extends AbstractCoffeeIngredientFactory {
    @Override
    public Ingredient createMilk() {
        return new MilkIngredient();
    }

    @Override
    public Ingredient createSyrup() {
        return new SyrupIngredient();
    }
}
