package controller;

import cart.CartItems;
import com.google.gson.Gson;
import entity.Item;
import entity.User;
import html.HtmlFormer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
public class CartController {

    private final HtmlFormer html = new HtmlFormer();
    private final ItemService iserv = new ItemService();
    private final AuthService auth = new AuthService();

    @GetMapping
    protected void doCart(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
                response.sendRedirect("/App1_web/cart");
            } else {
                List<Item> items = new LinkedList<>();
                for (Integer i : itemsIds.items) {
                    items.add(iserv.getById(i.toString()));
                }

                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
                    out.println(html.formCart(items, "Cart", u));
                }
            }

        }

    }
}
