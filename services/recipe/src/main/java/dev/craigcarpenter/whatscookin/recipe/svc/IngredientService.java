package dev.craigcarpenter.whatscookin.recipe.svc;

import dev.craigcarpenter.whatscookin.recipe.model.Ingredient;
import dev.craigcarpenter.whatscookin.recipe.model.IngredientType;

import java.util.Optional;

public interface IngredientService {
  Ingredient createIngredient(Ingredient ingredient);

  IngredientType createIngredientType(IngredientType ingredient);

  Optional<Ingredient> getIngredient(Long ingredientId);

  Optional<IngredientType> getIngredientType(Long ingredientTypeId);
}
