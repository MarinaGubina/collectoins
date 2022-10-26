import java.util.HashSet;
import java.util.Set;

public class BookOfRecipe {
    private Set<Recipe> recipes;

    public BookOfRecipe() {
        recipes = new HashSet<>();
    }

    public void getRecipe(){
        for (Recipe recipe: recipes) {
            System.out.println(recipe.getRecipeName());
        }
    }

    public void add(Recipe recipe){
        if(recipes.contains(recipe)){
            throw new RuntimeException(recipe.getRecipeName()+" - данный рецепт уже есть в книге!");
        }
        else {
            recipes.add(recipe);
        }
    }
}
