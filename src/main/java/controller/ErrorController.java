package controller;

import html.HtmlFormer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ErrorController {

    @GetMapping
    protected ModelAndView error() {
        /*response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println(html.formError("Error page"));
        }*/
        return new ModelAndView("error");
    }
}
