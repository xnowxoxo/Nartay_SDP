package CoffeeShop;

public class CoffeeOrderBuilder {
    private CoffeeOrder order;

    public CoffeeOrderBuilder(Coffee coffee) {
        Ingredient syrup = null;
        Ingredient milk = null;
        order = new CoffeeOrder(coffee, milk, syrup);
    }

    public CoffeeOrderBuilder addMilk() {
        order.addIngredient(new MilkIngredient());
        return this;
    }

    public CoffeeOrderBuilder addSyrup() {
        order.addIngredient(new SyrupIngredient());
        return this;
    }

    public CoffeeOrder build() {
        return order;
    }
}
