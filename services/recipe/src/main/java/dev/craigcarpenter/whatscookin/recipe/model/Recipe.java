package dev.craigcarpenter.whatscookin.recipe.model;

import java.util.List;

public class Recipe {

  public class IngredientUse {
    private long ingredientId;
    private int num;
    private MeasuringUnit unit;
  }

  private long id;
  private String name;
  private String description;
  private RecipeType recipeType;

  private int numServings;
  private int lowerTimeEstimate;
  private int upperTimeEstimate;
  private long userId;

  public long getId() {
    return id;
  }

  public Recipe setId(long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Recipe setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Recipe setDescription(String description) {
    this.description = description;
    return this;
  }

  public RecipeType getRecipeType() {
    return recipeType;
  }

  public Recipe setRecipeType(RecipeType recipeType) {
    this.recipeType = recipeType;
    return this;
  }

  public int getNumServings() {
    return numServings;
  }

  public Recipe setNumServings(int numServings) {
    this.numServings = numServings;
    return this;
  }

  public int getLowerTimeEstimate() {
    return lowerTimeEstimate;
  }

  public Recipe setLowerTimeEstimate(int lowerTimeEstimate) {
    this.lowerTimeEstimate = lowerTimeEstimate;
    return this;
  }

  public int getUpperTimeEstimate() {
    return upperTimeEstimate;
  }

  public Recipe setUpperTimeEstimate(int upperTimeEstimate) {
    this.upperTimeEstimate = upperTimeEstimate;
    return this;
  }

  public long getUserId() {
    return userId;
  }

  public Recipe setUserId(long userId) {
    this.userId = userId;
    return this;
  }
}
