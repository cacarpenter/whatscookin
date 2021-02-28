package dev.craigcarpenter.whatscookin.recipe.dao;

import dev.craigcarpenter.whatscookin.recipe.model.Recipe;

import java.util.Optional;

public interface RecipeDao {
    Recipe insert(Recipe recipe);

    Optional<Recipe> find(long id);

    Recipe update(Recipe recipe);

    boolean delete(long id);
}
