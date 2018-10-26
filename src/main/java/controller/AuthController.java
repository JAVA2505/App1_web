package controller;

import cache.ItemCacheService;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.AuthService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class AuthController {

    private final AuthService auth;

    @Autowired
    public AuthController(AuthService auth) {
        this.auth = auth;
    }

    @GetMapping
    public ModelAndView auth() {
        ItemCacheService.isTimerStarted();
        return new ModelAndView("auth");
    }

    @PostMapping
    public void doAuth(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("login");
        String pass = req.getParameter("pass");
        User u = auth.isUserRegistered(login, pass);
        if (u != null) {
            req.getSession().setAttribute("user", u);
            resp.sendRedirect("/App1_web/main");
        } else {
            resp.sendRedirect("/App1_web/error");
        }
    }
}
