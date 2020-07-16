package dev.craigcarpenter.whatscookin.auth.model;

public class WCUser {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public WCUser setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public WCUser setName(String name) {
        this.name = name;
        return this;
    }
}
