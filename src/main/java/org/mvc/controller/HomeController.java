package org.mvc.controller;

import org.mvc.annotation.Controller;
import org.mvc.annotation.RequestMapping;
import org.mvc.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {// implements org.mvc.controller.Controller {

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String home(HttpServletRequest request, HttpServletResponse response) {
//        return "home";
//    }

//    @Override
    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "home";
    }
}
