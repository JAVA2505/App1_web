package controller;


import entity.Item;
import entity.User;
import html.HtmlFormer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ItemService;
import spring.SpringContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    private final HtmlFormer html = new HtmlFormer();
    private final ItemService iserv = (ItemService) SpringContextHolder.getContext().getBean("iserv");

    @GetMapping
    public void doMain(HttpServletRequest request, HttpServletResponse response) throws IOException{

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
