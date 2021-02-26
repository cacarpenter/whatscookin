package dev.craigcarpenter.whatscookin.recipe.dao.impl;

import dev.craigcarpenter.whatscookin.recipe.dao.RecipeDao;
import dev.craigcarpenter.whatscookin.recipe.model.Recipe;
import org.springframework.stereotype.Repository;

@Repository
public class RecipeDaoJdbcImpl implements RecipeDao {
    @Override
    public Recipe insert(Recipe recipe) {
        // no real persistence yet. Just return it
        return recipe;
    }
}
