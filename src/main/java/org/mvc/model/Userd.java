package org.mvc.model;

public class Userd {
    private final String userId;
    private final String name;

    public Userd(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
