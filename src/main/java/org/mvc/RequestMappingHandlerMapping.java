package org.mvc;

import org.mvc.annotation.RequestMethod;
import org.mvc.controller.*;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping implements HandlerMapping {
    // [key]: /users, [value]: UserController - url
    private Map<HandlerKey, Controller> mappings = new HashMap<>();

    void init() {
//        mappings.put("/", new HomeController());
//        mappings.put(new HandlerKey(RequestMethod.GET, "/"), new HomeController());
//        mappings.put("/users", new UserListController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/users"), new UserListController());
//        mappings.put("/users", new UserCreateController());
        mappings.put(new HandlerKey(RequestMethod.POST, "/users"), new UserCreateController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/user/form"), new ForwardController("/user/form"));
    }

    public Controller findHandler(HandlerKey HandlerKey) {
        return mappings.get(HandlerKey);
    }
}
