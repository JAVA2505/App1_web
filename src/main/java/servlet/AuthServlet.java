package servlet;

import cache.ItemCacheService;
import entity.User;
import html.HtmlFormer;
import service.AuthService;
import service.ItemService;
import spring.SpringContextHolder;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthServlet extends HttpServlet {

    private final AuthService auth = (AuthService) SpringContextHolder.getContext().getBean("authservice");
    private final HtmlFormer html = (HtmlFormer) SpringContextHolder.getContext().getBean("htmlformer");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ItemCacheService.isTimerStarted();
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().append(html.formAuthorization());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("login");
        String pass = req.getParameter("pass");
        User u = auth.isUserRegistered(login, pass);
        if (u != null) {
            req.getSession().setAttribute("user", u);
            resp.setContentType("text/html;charset=UTF-8");
            resp.getWriter().append(html.formCheckedAuthorization(login, pass));
            resp.sendRedirect("/App1_web/main");
        } else {
            resp.sendRedirect("/App1_web/error");
        }
    }

}
