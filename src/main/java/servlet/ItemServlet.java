package servlet;

import entity.Item;
import entity.User;
import html.HtmlFormer;
import service.AuthService;
import service.ItemService;
import spring.SpringContextHolder;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ItemServlet extends HttpServlet {

    private final HtmlFormer html = (HtmlFormer) SpringContextHolder.getContext().getBean("htmlformer");
    private final ItemService iserv = (ItemService) SpringContextHolder.getContext().getBean("itemservice");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User u = (User) request.getSession().getAttribute("user");
        if (u != null) {
            String id = request.getParameter("id");
            Item i = iserv.getById(id);
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println(html.formItem("Item Page", u, i));
            }
        } else {
            response.sendRedirect("/App1_web/");
        }

    }
}
