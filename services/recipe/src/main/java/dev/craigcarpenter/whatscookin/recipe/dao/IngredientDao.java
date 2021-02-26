package dev.craigcarpenter.whatscookin.recipe.dao;

import dev.craigcarpenter.whatscookin.recipe.model.Ingredient;

public interface IngredientDao {
  Ingredient insert(Ingredient ingredient);
}
