package dev.craigcarpenter.whatscookin.recipe.svc.impl;

import dev.craigcarpenter.whatscookin.recipe.dao.RecipeDao;
import dev.craigcarpenter.whatscookin.recipe.model.Photo;
import dev.craigcarpenter.whatscookin.recipe.model.Recipe;
import dev.craigcarpenter.whatscookin.recipe.svc.FileStore;
import dev.craigcarpenter.whatscookin.recipe.svc.RecipeService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.io.InputStream;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {
  private final FileStore fileStore;
  private final RecipeDao recipeDao;

  @Inject
  public RecipeServiceImpl(FileStore fileStore, RecipeDao recipeDao) {
    this.fileStore = fileStore;
    this.recipeDao = recipeDao;
  }

  @Override
  public Recipe createRecipe(Recipe recipe) {
    // TODO pull user ID out from context
    recipe.setUserId(1);
    // TODO create recipe event, etc after dao insert. For now just inserting
    // generate an ID here? Or let the db/dao do it
    return recipeDao.insert(recipe);
  }

  @Override
  public Recipe updateRecipe(Recipe recipe) {
    return null;
  }

  @Override
  public Optional<Recipe> findRecipe(long id) {
    return Optional.empty();
  }

  @Override
  public boolean deleteRecipe(long id) {
    return false;
  }

  @Override
  public Photo createRecipePhoto(String recipeId, String name, InputStream inputStream) {
    fileStore.saveFile(recipeId, inputStream);
    return null;
  }
}
