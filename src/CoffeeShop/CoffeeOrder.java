package CoffeeShop;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrder implements Cloneable {
    private Coffee coffee;
    private List<Ingredient> ingredients;

    public CoffeeOrder(Coffee coffee, Ingredient milk, Ingredient syrup) {
        this.coffee = coffee;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public CoffeeOrder clone() throws CloneNotSupportedException {
        CoffeeOrder clonedOrder = (CoffeeOrder) super.clone();
        clonedOrder.ingredients = new ArrayList<>(this.ingredients);
        return clonedOrder;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder(coffee.getDescription());
        for (Ingredient ingredient : ingredients) {
            description.append(" + ").append(ingredient.getDescription());
        }
        return description.toString();
    }

    public void showOrder() {
    }
}
