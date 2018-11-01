package controller;

import cart.CartItems;
import com.google.gson.Gson;
import entity.Item;
import entity.User;
import html.HtmlFormer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.AuthService;
import service.ItemService;
import spring.SpringContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final ItemService iserv = new ItemService();
    private AuthService auth;

    @Autowired
    public CartController(AuthService auth) {
        this.auth = auth;
    }

    @GetMapping
    protected ModelAndView doCart(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User u = (User) request.getSession().getAttribute("user");
        if (u == null) {
            response.sendRedirect("/App1_web/");
        } else {
            String userItems = u.getItems();
            CartItems itemsIds = ((Gson) SpringContextHolder.getContext().getBean("gson")).fromJson(userItems, CartItems.class);

            String id = request.getParameter("id");
            if (id != null) {
                Integer idInt = Integer.valueOf(id);
                if (idInt == 0) {
                    itemsIds.items.clear();

                }
                if (idInt > 0) {
                    itemsIds.items.add(idInt);

                }
                if (idInt < 0) {
                    Integer idMinus = idInt * -1;
                    itemsIds.items.remove(idMinus);

                }
                u.setItems(((Gson) SpringContextHolder.getContext().getBean("gson")).toJson(itemsIds));
                auth.updateUser(u);

                List<Item> items = new LinkedList<>();
                for (Integer i : itemsIds.items) {
                    items.add(iserv.getById(i.toString()));
                }

                ModelAndView out = new ModelAndView("cart");

                out.addObject("user", u);
                out.addObject("items", items);
                return out;

            } else {
                List<Item> items = new LinkedList<>();
                for (Integer i : itemsIds.items) {
                    items.add(iserv.getById(i.toString()));
                }

                ModelAndView out = new ModelAndView("cart");

                out.addObject("user", u);
                out.addObject("items", items);
                return out;
            }


        }
        return null;
    }
}
