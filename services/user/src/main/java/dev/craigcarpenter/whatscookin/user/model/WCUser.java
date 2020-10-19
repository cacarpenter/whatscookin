package dev.craigcarpenter.whatscookin.user.model;

public class WCUser {
    private int id;
    private String username;

    public int getId() {
        return id;
    }

    public WCUser setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public WCUser setUsername(String username) {
        this.username = username;
        return this;
    }
}
