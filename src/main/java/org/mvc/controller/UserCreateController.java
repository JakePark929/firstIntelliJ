package org.mvc.controller;

import org.mvc.model.Userd;
import org.mvc.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserCreateController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // user 추가
        UserRepository.save(new Userd(request.getParameter("userId"), request.getParameter("name")));
        return "redirect:/users";
    }
}
