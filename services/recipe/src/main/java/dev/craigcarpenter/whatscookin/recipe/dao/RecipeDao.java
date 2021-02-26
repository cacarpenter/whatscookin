package dev.craigcarpenter.whatscookin.recipe.dao;

import dev.craigcarpenter.whatscookin.recipe.model.Recipe;

public interface RecipeDao {
    Recipe insert(Recipe recipe);
}
