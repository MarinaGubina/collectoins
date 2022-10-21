import java.util.Objects;
import java.util.Set;

public class Recipe {
    private ShoppingList shoppingList;
    private double sumCost;
    private String recipeName;

    public Recipe(String recipeName, ShoppingList shoppingList) {
        this.recipeName = recipeName;
        this.shoppingList = shoppingList;
    }

    public ShoppingList getShoppingList() {
        return shoppingList;
    }

    public double getSumCost() {
        return shoppingList.getSumCost();
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shoppingList, sumCost, recipeName);
    }
}
