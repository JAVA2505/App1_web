package controller;

import entity.Item;
import entity.User;
import html.HtmlFormer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import service.ItemService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class ItemController {


    private final HtmlFormer html = new HtmlFormer();
    private final ItemService iserv = new ItemService();

    @GetMapping
    protected void doItem(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
