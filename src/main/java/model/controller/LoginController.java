package model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    // Método para cargar la página de login
    @RequestMapping(value = "/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    // Método para cargar la página de error de login
    @RequestMapping(value = "/error")
    public ModelAndView errorLogin() {
        return new ModelAndView("login", "error", "true");
    }

}


























