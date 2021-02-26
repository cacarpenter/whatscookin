package dev.craigcarpenter.whatscookin.recipe.dao.impl;

import dev.craigcarpenter.whatscookin.recipe.dao.IngredientTypeDao;
import dev.craigcarpenter.whatscookin.recipe.model.IngredientType;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.Optional;

@Repository
public class IngredientTypePostgresDao implements IngredientTypeDao {

  private static final RowMapper<IngredientType> INGREDIENT_TYPE_ROW_MAPPER =
      (rs, rn) ->
          new IngredientType()
              .setId(rs.getLong("id"))
              .setName(rs.getString("name"))
              .setParentId(rs.getLong("parent_ingredient_type_id"));

  private final NamedParameterJdbcTemplate jdbcTemplate;

  @Inject
  public IngredientTypePostgresDao(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public IngredientType insert(IngredientType ingredientType) {
    IngredientType inserted =
        new IngredientType()
            .setName(ingredientType.getName())
            .setParentId(ingredientType.getParentId());
    jdbcTemplate.query(
        "INSERT INTO ingredient_type (name, parent_ingredient_type_id) VALUES (:name, :parent_ingredient_type_id) RETURNING id",
        new MapSqlParameterSource()
            .addValue("name", ingredientType.getName())
            .addValue("parent_ingredient_type_id", ingredientType.getParentId()),
        resultSet -> {
          inserted.setId(resultSet.getInt(1));
        });
    return inserted;
  }

  @Override
  public Optional<IngredientType> findById(long id) {
    return jdbcTemplate
        .query(
            "SELECT id, name, parent_ingredient_type_id FROM ingredient_type WHERE id = :id",
            new MapSqlParameterSource("id", id),
            INGREDIENT_TYPE_ROW_MAPPER)
        .stream()
        .findFirst();
  }
}
