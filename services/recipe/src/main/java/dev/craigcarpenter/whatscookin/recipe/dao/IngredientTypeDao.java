package dev.craigcarpenter.whatscookin.recipe.dao;

import dev.craigcarpenter.whatscookin.recipe.model.IngredientType;

import java.util.Optional;

public interface IngredientTypeDao {
    IngredientType insert(IngredientType ingredientType);

    Optional<IngredientType> findById(long id);
}
