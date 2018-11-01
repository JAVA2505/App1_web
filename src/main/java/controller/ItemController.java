package controller;

import entity.Item;
import entity.User;
import html.HtmlFormer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.ItemService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/item")
public class ItemController {

    private final ItemService iserv = new ItemService();

    @GetMapping
    protected ModelAndView doItem(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User u = (User) request.getSession().getAttribute("user");
        if (u != null) {
            String id = request.getParameter("id");
            Item i = iserv.getById(id);

            ModelAndView out = new ModelAndView("item");

            out.addObject("item", i);
            out.addObject("user", u);

            return out;

        } else {
            response.sendRedirect("/App1_web/");
        }
        return null;
    }
}
