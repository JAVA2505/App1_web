package servlet;

import html.HtmlFormer;
import service.AuthService;
import spring.SpringContextHolder;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {

    private static final String REGISTER = "Register Page";
    private static final String CONTENT_TYPE = "text/html;charset=UTF-8";

    private final HtmlFormer html = (HtmlFormer) SpringContextHolder.getContext().getBean("htmlformer");
    private final AuthService auth = (AuthService) SpringContextHolder.getContext().getBean("authservice");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType(CONTENT_TYPE);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println(html.formRegister(REGISTER));
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
