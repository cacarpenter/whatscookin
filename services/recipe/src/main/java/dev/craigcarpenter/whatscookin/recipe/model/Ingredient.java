package dev.craigcarpenter.whatscookin.recipe.model;

public class Ingredient {
    private long id;
    private long ingredientTypeId;
    private String name;

    public long getId() {
        return id;
    }

    public Ingredient setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Ingredient setName(String name) {
        this.name = name;
        return this;
    }

    public long getIngredientTypeId() {
        return ingredientTypeId;
    }

    public Ingredient setIngredientTypeId(long ingredientTypeId) {
        this.ingredientTypeId = ingredientTypeId;
        return this;
    }
}
