package dev.craigcarpenter.whatscookin.recipe.svc.impl;

import dev.craigcarpenter.whatscookin.recipe.dao.IngredientDao;
import dev.craigcarpenter.whatscookin.recipe.dao.IngredientTypeDao;
import dev.craigcarpenter.whatscookin.recipe.model.Ingredient;
import dev.craigcarpenter.whatscookin.recipe.model.IngredientType;
import dev.craigcarpenter.whatscookin.recipe.svc.IngredientService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Optional;

@Named
public class IngredientServiceImpl implements IngredientService {

  private final IngredientDao ingredientDao;
  private final IngredientTypeDao ingredientTypeDao;

  @Inject
  public IngredientServiceImpl(IngredientDao dao, IngredientTypeDao ingredientTypeDao) {
    this.ingredientDao = dao;
    this.ingredientTypeDao = ingredientTypeDao;
  }

  @Override
  public Ingredient createIngredient(Ingredient ingredient) {
    return ingredientDao.insert(ingredient);
  }

  @Override
  public IngredientType createIngredientType(IngredientType ingredientType) {
    return ingredientTypeDao.insert(ingredientType);
  }

  @Override
  public Optional<Ingredient> getIngredient(Long ingredientId) {
    return Optional.empty();
  }

  @Override
  public Optional<IngredientType> getIngredientType(Long ingredientTypeId) {
      return ingredientTypeDao.findById(ingredientTypeId);
  }
}
