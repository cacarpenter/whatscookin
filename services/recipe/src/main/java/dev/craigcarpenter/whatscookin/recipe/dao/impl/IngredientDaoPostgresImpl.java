package dev.craigcarpenter.whatscookin.recipe.dao.impl;

import dev.craigcarpenter.whatscookin.recipe.dao.IngredientDao;
import dev.craigcarpenter.whatscookin.recipe.model.Ingredient;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class IngredientDaoPostgresImpl implements IngredientDao {

  private final NamedParameterJdbcTemplate jdbcTemplate;

  @Inject
  public IngredientDaoPostgresImpl(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public Ingredient insert(Ingredient ingredient) {
    return null;
  }
}
