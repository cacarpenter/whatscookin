package dev.craigcarpenter.whatscookin.recipe.api;

import dev.craigcarpenter.whatscookin.recipe.model.Recipe;
import dev.craigcarpenter.whatscookin.recipe.svc.FileStore;
import dev.craigcarpenter.whatscookin.recipe.svc.RecipeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.inject.Inject;
import java.net.URI;

@RestController
@RequestMapping(value = "/v1")
public class RecipeController {

  private static final Logger log = LoggerFactory.getLogger(RecipeController.class);
  private final RecipeService recipeService;

  @Inject
  public RecipeController(RecipeService recipeService) {
    this.recipeService = recipeService;
  }

  @PostMapping(value = "/recipes")
  public ResponseEntity<Recipe> postRecipe(@Validated @RequestBody Recipe recipe) {
    Recipe created = recipeService.createRecipe(recipe);
    URI location =
        ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(created.getId())
            .toUri();
    return ResponseEntity.created(location).body(created);
  }

  @PostMapping(value = "/recipes/{recipeId}/photos")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void postRecipePhoto(
      @PathVariable String recipeId, @RequestParam("file") MultipartFile file) {
    log.info("postRecipePhoto {} : {} {}", recipeId, file.getName(), file.getSize());
    // return fileStore.storeFile(fileId, file);
  }
}