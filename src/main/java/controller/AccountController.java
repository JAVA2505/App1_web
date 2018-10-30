package controller;

import dao.UserDao;
import entity.User;
import html.HtmlFormer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class AccountController {

    private HtmlFormer html = new HtmlFormer();
    private UserDao udao = new UserDao();

    @GetMapping
    protected void doAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User u = (User) request.getSession().getAttribute("user");

        String l = request.getParameter("login");

        String p1 = request.getParameter("pass1");
        String p2 = request.getParameter("pass2");

        String ph = request.getParameter("phone");

        String c = request.getParameter("city");
        if (l == null && p1 == null && p2 == null && ph == null && c == null) {

            try (PrintWriter out = response.getWriter()) {

                out.println(html.formUserAccount(u));
            }
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
            response.sendRedirect("/App1_web/account");
        }
    }
}
