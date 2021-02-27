package dev.craigcarpenter.whatscookin.recipe.api;

import dev.craigcarpenter.whatscookin.recipe.model.Ingredient;
import dev.craigcarpenter.whatscookin.recipe.model.IngredientType;
import dev.craigcarpenter.whatscookin.recipe.svc.IngredientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Optional;

@RestController
@RequestMapping(value = "/v1")
public class IngredientController {
  private static final Logger log = LoggerFactory.getLogger(IngredientController.class);

  private final IngredientService ingredientService;

  @Inject
  public IngredientController(IngredientService ingredientService) {
    this.ingredientService = ingredientService;
  }

  @PostMapping(value = "/ingredients")
  public Ingredient postIngredient(@Validated @RequestBody Ingredient ingredient) {
    log.debug("postIngredient {}", ingredient.getName());
    // return ingredientService.
    return ingredient;
  }

  @PostMapping(value = "/ingredient-types")
  public IngredientType postIngredientType(@Validated @RequestBody IngredientType ingredientType) {
    log.debug("postIngredientType {}", ingredientType.getName());
    return ingredientService.createIngredientType(ingredientType);
  }

  @GetMapping(value = "/ingredient-types/{id}")
  public IngredientType getIngredientType(@PathVariable("id") String id) {
    Optional<IngredientType> lookup = ingredientService.getIngredientType(Long.valueOf(id));
    return lookup.orElseThrow();
  }
}
