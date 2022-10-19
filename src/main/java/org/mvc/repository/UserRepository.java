package org.mvc.repository;

import org.mvc.model.Userd;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static Map<String, Userd> users = new HashMap<>();

    public static void save(Userd user) {
        users.put(user.getUserId(), user);
    }

    public static Collection<Userd> findAll() {
        return users.values();
    }
}
