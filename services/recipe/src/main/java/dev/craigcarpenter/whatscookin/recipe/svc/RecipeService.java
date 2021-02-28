package dev.craigcarpenter.whatscookin.recipe.svc;

import dev.craigcarpenter.whatscookin.recipe.model.Photo;
import dev.craigcarpenter.whatscookin.recipe.model.Recipe;

import java.io.InputStream;
import java.util.Optional;

public interface RecipeService {
  Recipe createRecipe(Recipe recipe);

  Recipe updateRecipe(Recipe recipe);

  Optional<Recipe> findRecipe(long id);

  boolean deleteRecipe(long id);

  Photo createRecipePhoto(Long recipeId, String name, InputStream inputStream);
}
