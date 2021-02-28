package dev.craigcarpenter.whatscookin.recipe.dao.impl;

import dev.craigcarpenter.whatscookin.recipe.dao.RecipeDao;
import dev.craigcarpenter.whatscookin.recipe.model.Recipe;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.Map;
import java.util.Optional;

@Repository
public class RecipeDaoPostgresImpl implements RecipeDao {

  private static final RowMapper<Recipe> RECIPE_ROW_MAPPER =
      (rs, rn) ->
          new Recipe()
              .setId(rs.getLong("id"))
              .setName(rs.getString("name"))
              .setDescription(rs.getString("description"));

  private final NamedParameterJdbcTemplate jdbcTemplate;

  @Inject
  public RecipeDaoPostgresImpl(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public Recipe insert(Recipe recipe) {
    Recipe inserted =
        new Recipe().setName(recipe.getName()).setDescription(recipe.getDescription());
    jdbcTemplate.query(
        "INSERT INTO recipe (name, description, user_id) VALUES (:name, :description, :user_id) RETURNING id",
        new MapSqlParameterSource()
            .addValue("name", recipe.getName())
            .addValue("description", recipe.getDescription())
            .addValue("user_id", recipe.getUserId()),
        resultSet -> {
          inserted.setId(resultSet.getInt(1));
        });
    return inserted;
  }

  @Override
  public Optional<Recipe> find(long id) {
    return jdbcTemplate
        .query("SELECT * FROM recipe WHERE id = :id", Map.of("id", id), RECIPE_ROW_MAPPER)
        .stream()
        .findFirst();
  }
}
