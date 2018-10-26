package servlet;

import entity.Item;
import entity.User;
import html.HtmlFormer;
import service.ItemService;
import spring.SpringContextHolder;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class MainServlet extends HttpServlet {

    private final HtmlFormer html = new HtmlFormer();
    private final ItemService iserv = (ItemService) SpringContextHolder.getContext().getBean("iserv");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User u = (User) request.getSession().getAttribute("user");
        if (u != null) {
            List<Item> items;
            if (request.getParameter("q") == null) {
                items = iserv.get();
            } else {
                String q = request.getParameter("q");
                items = iserv.getByWord(q);
                try (PrintWriter out = response.getWriter()) {
                    out.println(html.formSearching("Weed Store", u, items, request.getParameter("q")));
                }
                return;
            }
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println(html.formMain("Weed Store", u, items));
            }
        } else {
            response.sendRedirect("/App1_web/");
        }
    }

}
