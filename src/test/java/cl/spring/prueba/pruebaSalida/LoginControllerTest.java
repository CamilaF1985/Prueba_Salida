package cl.spring.prueba.pruebaSalida;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import model.controller.LoginController;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginControllerTest {

    @Test
    public void testLogin() {
        LoginController loginController = new LoginController();
        ModelAndView modelAndView = loginController.login();

        assertEquals("login", modelAndView.getViewName());
    }

    @Test
    public void testErrorLogin() {
        LoginController loginController = new LoginController();
        ModelAndView modelAndView = loginController.errorLogin();

        assertEquals("login", modelAndView.getViewName());
        assertEquals("true", modelAndView.getModel().get("error"));
    }
}