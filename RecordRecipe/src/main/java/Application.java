import java.util.List;

import logic.RecipeService;

public class Application {
	public static void main(String[] args) {
		String recipe1 = "Pancake #1";
		String recipe2 = "Ham & Eggs #1";
		String recipe3 = "Pancake #2";
		String recipe4 = "Pancake #3";
		List<String> recipes = List.of(recipe1, recipe2, recipe3, recipe4);
		RecipeService recipeService = new RecipeService();
		List<String> uniqueRecipes = recipeService.getUniqueRecipes(recipes);
		System.out.println(uniqueRecipes);
	}
}
