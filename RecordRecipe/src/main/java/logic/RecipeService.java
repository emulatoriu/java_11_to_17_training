package logic;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Recipe;

public class RecipeService {
	public List<String> getUniqueRecipes(List<String> recipes) {
		return recipes.stream()
				.map(recipe -> new Recipe(recipe, 
						recipe.substring(0, recipe.indexOf('#')-1), 
						Integer.parseInt(recipe.substring(recipe.indexOf('#')+1))
)
					)
				.sorted(Comparator.comparing(Recipe::version).reversed())
				.distinct()				
				.map(recipe -> "%s #%s".formatted(recipe.title(), recipe.version()))
				.collect(Collectors.toList());
	}
}
