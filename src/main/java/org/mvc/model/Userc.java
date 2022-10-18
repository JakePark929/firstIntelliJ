package org.mvc.model;

import java.util.Objects;

public class Userc {
    private String userId;
    private String name;

    public Userc(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public boolean equalsUser(Userc user) {
        return this.equals(user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userc userc = (Userc) o;
        return Objects.equals(userId, userc.userId) && Objects.equals(name, userc.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name);
    }
}
