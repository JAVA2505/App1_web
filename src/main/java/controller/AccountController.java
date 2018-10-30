package controller;

import dao.UserDao;
import entity.User;
import html.HtmlFormer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
//@RequestMapping("/account")
public class AccountController {

    private UserDao udao = new UserDao();

//    @GetMapping
    protected ModelAndView doAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User u = (User) request.getSession().getAttribute("user");

        String l = request.getParameter("login");

        String p1 = request.getParameter("pass1");
        String p2 = request.getParameter("pass2");

        String ph = request.getParameter("phone");

        String c = request.getParameter("city");
        if (l == null && p1 == null && p2 == null && ph == null && c == null) {

            return new ModelAndView("account");
        } else {

            if (!l.equals("")) {

                u.setLogin(l);
            }
            if (p1.equals(u.getPass()) && !p2.equals("")) {

                u.setPass(p2);
            }
            if (!ph.equals("")) {

                u.setPhone(ph);
            }
            if (!c.equals("")) {

                u.setCity(c);
            }

            udao.updateUser(u);
            return new ModelAndView("account");
        }
    }
}
