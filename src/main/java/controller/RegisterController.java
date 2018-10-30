package controller;

import html.HtmlFormer;
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
@RequestMapping("/register")
public class RegisterController {

    private final AuthService auth = new AuthService();

    @GetMapping
    public ModelAndView register() throws IOException {
       return new ModelAndView("register");
    }

    @PostMapping
    protected void doRegister(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String login = request.getParameter("login");
        String pass1 = request.getParameter("pass1");
        String pass2 = request.getParameter("pass2");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
        if (!auth.checkCredentials(login, pass1, pass2, phone, city)) {
            response.sendRedirect("/App1_web/error");
        } else {
            auth.addNewUser(login, pass2, phone, city);
            response.sendRedirect("/App1_web/");
        }
    }

}
