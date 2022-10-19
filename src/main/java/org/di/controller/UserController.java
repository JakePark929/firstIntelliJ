package org.di.controller;

import org.di.annotation.Controller;
import org.di.annotation.Inject;
import org.di.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }
}
