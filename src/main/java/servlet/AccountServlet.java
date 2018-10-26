package servlet;

import dao.UserDao;
import entity.User;
import html.HtmlFormer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AccountServlet")
public class AccountServlet extends HttpServlet {

    private HtmlFormer html = new HtmlFormer();
    private UserDao udao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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

/*if(u != null){

                String l = request.getParameter("login");

                String p1 = request.getParameter("pass1");
                String p2 = request.getParameter("pass2");

                String ph = request.getParameter("phone");

                String c = request.getParameter("city");

                if (l != null && l.length() > 0) {

                    u.setLogin(l);
                }
                if (p1.equals(u.getPass()) && p2 != null && p2.length() > 4) {

                    u.setPass(p2);
                }
                if (ph != null && ph.length() >= 10) {

                    u.setPhone(ph);
                }
                if (c != null && c.length() > 0) {

                    u.setCity(c);
                }

                udao.updateUser(u);*/