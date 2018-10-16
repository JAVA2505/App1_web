package servlet;

import entity.User;
import html.HtmlFormer;
import service.ItemService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    private final HtmlFormer html = new HtmlFormer();
    private final ItemService iserv = new ItemService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User u = (User) request.getSession().getAttribute("user");
        if (u != null) {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println(html.formMain("Weed Store", u, iserv.get()));
            }
        } else {
            response.sendRedirect("/App1_web/");
        }
    }

}
