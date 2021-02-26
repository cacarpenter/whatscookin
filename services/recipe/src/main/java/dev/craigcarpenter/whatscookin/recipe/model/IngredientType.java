package dev.craigcarpenter.whatscookin.recipe.model;

public class IngredientType {
    private long id;
    private Long parentId;
    private String name;

    public long getId() {
        return id;
    }

    public IngredientType setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public IngredientType setName(String name) {
        this.name = name;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public IngredientType setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
}
