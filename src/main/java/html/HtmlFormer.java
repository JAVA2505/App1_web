package html;

import entity.Item;
import entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlFormer {

    private String formHead(String title) {
        StringBuilder b = new StringBuilder();
        b.append("<!DOCTYPE html>");
        b.append("<html>");
        b.append("<head>");
        b.append("<title>");
        b.append(title);
        b.append("</title>");

        b.append("<style type='text/css'>");
        b.append("table {\n" +
                "font-family: \"Lucida Sans Unicode\", \"Lucida Grande\", Sans-Serif;\n" +
                "font-size: 14px;\n" +
                "border-collapse: collapse;\n" +
                "text-align: center;\n" +
                "color: white;\n" +
                "}\n" +
                "td {\n" +
                "background: linear-gradient(#1f2124, #27292c);   \n" +
                "}\n" +
                "th:first-child, td:first-child {\n" +
                "text-align: left;\n" +
                "}");
        b.append("</style>");

        b.append("</head>");
        b.append("<body link=\"#40E0D0\" vlink=\"#F5FFFA\" alink=\"#ff0000\" bgcolor=\"orange\">");
        return b.toString();
    }

    private String formEnd() {
        StringBuilder b = new StringBuilder();
        b.append("</body>");
        b.append("</html>");
        return b.toString();
    }

    public String formRegister2(String title) {

        StringBuilder out = new StringBuilder();

        out.append("<!DOCTYPE html>");
        out.append("<html>");
        out.append("<head>");
        out.append("<title>Login page</title>");
        out.append("<style type='text/css'>");
        out.append(".form-3 {\n" +
                "    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +
                "    font-weight: 400;\n" +
                "    /* Size and position */\n" +
                "    width: 350px;\n" +
                "    position: relative;\n" +
                "    margin: 60px auto 30px;\n" +
                "    padding: 10px;\n" +
                "    overflow: hidden;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    background: #111;\n" +
                "    border-radius: 0.4em;\n" +
                "    border: 1px solid #191919;\n" +
                "    box-shadow:\n" +
                "        inset 0 0 2px 1px rgba(255,255,255,0.08),\n" +
                "        0 16px 10px -8px rgba(0, 0, 0, 0.6);\n" +
                "}" +
                ".form-3 label {\n" +
                "    /* Size and position */\n" +
                "    width: 95%;\n" +
                "    float: left;\n" +
                "    padding-top: 9px;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    color: #ddd;\n" +
                "    font-size: 12px;\n" +
                "    text-transform: uppercase;\n" +
                "    letter-spacing: 1px;\n" +
                "    text-shadow: 0 1px 0 #000;\n" +
                "    text-indent: 10px;\n" +
                "    font-weight: 700;\n" +
                "    cursor: pointer;\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=text],\n" +
                ".form-3 input[type=password] {\n" +
                "    /* Size and position */\n" +
                "    width: 95%;\n" +
                "    float: left;\n" +
                "    padding: 8px 5px;\n" +
                "    margin-bottom: 10px;\n" +
                "    font-size: 12px;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    background: linear-gradient(#1f2124, #27292c);   \n" +
                "    border: 1px solid #000;\n" +
                "    box-shadow:\n" +
                "        0 1px 0 rgba(255,255,255,0.1);\n" +
                "    border-radius: 3px;\n" +
                " \n" +
                "    /* Font styles */\n" +
                "    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +
                "    color: #fff;\n" +
                " \n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=text]:hover,\n" +
                ".form-3 input[type=password]:hover,\n" +
                ".form-3 label:hover ~ input[type=text],\n" +
                ".form-3 label:hover ~ input[type=password] {\n" +
                "    background: #27292c;\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=text]:focus,\n" +
                ".form-3 input[type=password]:focus {\n" +
                "    box-shadow: inset 0 0 2px #000;\n" +
                "    background: #494d54;\n" +
                "    border-color: #51cbee;\n" +
                "    outline: none; /* Remove Chrome outline */\n" +
                "}" +
                ".form-3 p:nth-child(3),\n" +
                ".form-3 p:nth-child(4) {\n" +
                "    float: left;\n" +
                "    width: 50%;\n" +
                "}" +
                ".form-3 label[for=remember] {\n" +
                "    width: auto;\n" +
                "    float: none;\n" +
                "    display: inline-block;\n" +
                "    text-transform: capitalize;\n" +
                "    font-size: 11px;\n" +
                "    font-weight: 400;\n" +
                "    letter-spacing: 0px;\n" +
                "    text-indent: 2px;\n" +
                "}\n" +
                ".form-3 input[type=submit] {\n" +
                "    /* Width and position */\n" +
                "    width: 100%;\n" +
                "    padding: 8px 5px;\n" +
                "   \n" +
                "    /* Styles */\n" +
                "    border: 1px solid #0273dd; /* Fallback */\n" +
                "    border: 1px solid rgba(0,0,0,0.4);\n" +
                "    box-shadow:\n" +
                "        inset 0 1px 0 rgba(255,255,255,0.3),\n" +
                "        inset 0 10px 10px rgba(255,255,255,0.1);\n" +
                "    border-radius: 3px;\n" +
                "    background: #38a6f0;\n" +
                "    cursor:pointer;\n" +
                "   \n" +
                "    /* Font styles */\n" +
                "    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +
                "    color: white;\n" +
                "    font-weight: 700;\n" +
                "    font-size: 15px;\n" +
                "    text-shadow: 0 -1px 0 rgba(0,0,0,0.8);\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=submit]:hover {\n" +
                "    box-shadow: inset 0 1px 0 rgba(255,255,255,0.6);\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=submit]:active {\n" +
                "    background: #287db5;\n" +
                "    box-shadow: inset 0 0 3px rgba(0,0,0,0.6);\n" +
                "    border-color: #000; /* Fallback */\n" +
                "    border-color: rgba(0,0,0,0.9);\n" +
                "}\n" +
                " \n" +
                ".no-boxshadow .form-3 input[type=submit]:hover {\n" +
                "    background: #2a92d8;\n" +
                "}" +
                "/* Gradient line */\n" +
                ".form-3:after {\n" +
                "    /* Size and position */\n" +
                "    content: \"\";\n" +
                "    height: 1px;\n" +
                "    width: 33%;\n" +
                "    position: absolute;\n" +
                "    left: 20%;\n" +
                "    top: 0;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    background: linear-gradient(left, transparent, #444, #b6b6b8, #444, transparent);\n" +
                "}\n" +
                " \n" +
                "/* Small flash */\n" +
                ".form-3:before {\n" +
                "    /* Size and position */\n" +
                "    content: \"\";\n" +
                "    width: 8px;\n" +
                "    height: 5px;\n" +
                "    position: absolute;\n" +
                "    left: 34%;\n" +
                "    top: -7px;\n" +
                "     \n" +
                "    /* Styles */\n" +
                "    border-radius: 50%;\n" +
                "    box-shadow: 0 0 6px 4px #fff;\n" +
                "}" +
                ".form-3 p:nth-child(1):before{\n" +
                "    /* Size and position */\n" +
                "    content: \"\";\n" +
                "    width: 250px;\n" +
                "    height: 100px;\n" +
                "    position: absolute;\n" +
                "    top: 0;\n" +
                "    left: 45px;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    transform: rotate(75deg);\n" +
                "    background: linear-gradient(50deg, rgba(255,255,255,0.15), rgba(0,0,0,0));\n" +
                "    pointer-events: none;\n" +
                "}" +
                ".no-pointerevents .form-3 p:nth-child(1):before {\n" +
                "    display: none;\n" +
                "}");
        out.append("</style>");
        out.append("</head>");
        out.append("<body style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>");
        out.append("<form action='/App1_web/register' method='POST' class=\"form-3\">\n" +
                "    <p class=\"clearfix\">\n" +
                "        <label for=\"login\">Login</label>\n" +
                "        <input required type=\"text\" name=\"login\" id=\"login\" placeholder=\"Input login\">\n" +
                "    </p>\n" +
                "    <p class=\"clearfix\">\n" +
                "        <label for=\"pass1\">Password</label>\n" +
                "        <input required type=\"password\" name=\"pass1\" id=\"pass1\" placeholder=\"Input password\">\n" +
                "    </p>\n" +
                "<p class=\"clearfix\">\n" +
                "        <label for=\"pass2\">Repeat password</label>\n" +
                "        <input required style='width: 95%' type=\"password\" name=\"pass2\" id=\"pass2\" placeholder=\"Input password again\">\n" +
                "    </p><br>\n" +
                "<p class=\"clearfix\">\n" +
                "        <label for=\"phone\">Phone</label>\n" +
                "        <input required type=\"text\" name=\"phone\" id=\"phone\" placeholder=\"Input phone number\">\n" +
                "    </p>\n" +
                "<p class=\"clearfix\">\n" +
                "        <label for=\"city\">City</label>\n" +
                "        <input required type=\"text\" name=\"city\" id=\"city\" placeholder=\"Input city\">\n" +
                "    </p>\n" +
                "    <p class=\"clearfix\">\n" +
                "        <input type=\"submit\" name=\"submit\" value=\"Sign Up\">\n" +
                "    </p>      \n" +
                "</form>");
        out.append("<form action='/App1_web/' method='GET' class=\"form-3\">\n" +
                "    <p class=\"clearfix\">\n" +
                "        <input type=\"submit\" name=\"submit\" value=\"Sign In\">\n" +
                "    </p>      \n" +
                "</form>");
        out.append("</body>");
        out.append("</html>");

        return out.toString();
    }

    public String formError(String title) {
        StringBuilder b = new StringBuilder();
        b.append(formHead(title));
        b.append("<h1>Unknown error!!!!</h1>");
        b.append("<form action='/App1_web/' method='GET'>");
        b.append("<input type='submit' value='Log In'/>");
        b.append("</form>");
        b.append("<form action='/App1_web/register' method='GET'>");
        b.append("<input type='submit' value='Register'/>");
        b.append("</form>");
        b.append(formEnd());
        return b.toString();
    }

    public String formMain(String title, User u, List<Item> items) {
        StringBuilder b = new StringBuilder();
        b.append(formHead(title));
        b.append("<div id='header' style='height: 83px; background-color: aqua'>");
        b.append(generateHeader(u.getLogin()));
        b.append("</div>");
        b.append("<table  width = \"100%\" class='goods'>");
        b.append("  <tr>");
        b.append("    <td align = 'left'>");

        b.append("    </td>");
        b.append("    <td width = '60px' align = 'right'>");
        b.append("          <form action='/App1_web/main' method='GET'>");
        b.append("              Search:<input name='q'/><br/>");
        b.append("              <input type='submit' value='Search'/>");
        b.append("          </form>");
        b.append("     </td>");
        b.append("  </tr>");
        b.append("</table>");
        b.append("<div id='content' style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>");
        b.append("<h1>Items:</h1>");
        b.append("            <table class=\"goods\">");
        for (Item i : items) {
            b.append(commonViewOfItem(i));
        }
        b.append("            </table>");
        b.append("</div>");
        b.append(generateFooter());
        b.append(formEnd());
        return b.toString();
    }

    public String formAuthorization2() {

        StringBuilder out = new StringBuilder();

        out.append("<!DOCTYPE html>");
        out.append("<html>");
        out.append("<head>");
        out.append("<title>Login page</title>");
        out.append("<style type='text/css'>");
        out.append(".form-3 {\n" +
                "    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +
                "    font-weight: 400;\n" +
                "    /* Size and position */\n" +
                "    width: 350px;\n" +
                "    position: relative;\n" +
                "    margin: 60px auto 30px;\n" +
                "    padding: 10px;\n" +
                "    overflow: hidden;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    background: #111;\n" +
                "    border-radius: 0.4em;\n" +
                "    border: 1px solid #191919;\n" +
                "    box-shadow:\n" +
                "        inset 0 0 2px 1px rgba(255,255,255,0.08),\n" +
                "        0 16px 10px -8px rgba(0, 0, 0, 0.6);\n" +
                "}" +
                ".form-3 label {\n" +
                "    /* Size and position */\n" +
                "    width: 95%;\n" +
                "    float: left;\n" +
                "    padding-top: 9px;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    color: #ddd;\n" +
                "    font-size: 12px;\n" +
                "    text-transform: uppercase;\n" +
                "    letter-spacing: 1px;\n" +
                "    text-shadow: 0 1px 0 #000;\n" +
                "    text-indent: 10px;\n" +
                "    font-weight: 700;\n" +
                "    cursor: pointer;\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=text],\n" +
                ".form-3 input[type=password] {\n" +
                "    /* Size and position */\n" +
                "    width: 95%;\n" +
                "    float: left;\n" +
                "    padding: 8px 5px;\n" +
                "    margin-bottom: 10px;\n" +
                "    font-size: 12px;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    background: linear-gradient(#1f2124, #27292c);   \n" +
                "    border: 1px solid #000;\n" +
                "    box-shadow:\n" +
                "        0 1px 0 rgba(255,255,255,0.1);\n" +
                "    border-radius: 3px;\n" +
                " \n" +
                "    /* Font styles */\n" +
                "    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +
                "    color: #fff;\n" +
                " \n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=text]:hover,\n" +
                ".form-3 input[type=password]:hover,\n" +
                ".form-3 label:hover ~ input[type=text],\n" +
                ".form-3 label:hover ~ input[type=password] {\n" +
                "    background: #27292c;\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=text]:focus,\n" +
                ".form-3 input[type=password]:focus {\n" +
                "    box-shadow: inset 0 0 2px #000;\n" +
                "    background: #494d54;\n" +
                "    border-color: #51cbee;\n" +
                "    outline: none; /* Remove Chrome outline */\n" +
                "}" +
                ".form-3 p:nth-child(3),\n" +
                ".form-3 p:nth-child(4) {\n" +
                "    float: left;\n" +
                "    width: 95%;\n" +
                "}" +
                ".form-3 label[for=remember] {\n" +
                "    width: auto;\n" +
                "    float: left;\n" +
                "    display: inline-block;\n" +
                "    text-transform: capitalize;\n" +
                "    font-size: 11px;\n" +
                "    font-weight: 400;\n" +
                "    letter-spacing: 0px;\n" +
                "    text-indent: 2px;\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=checkbox] {\n" +
                "    margin-left: 10px;\n" +
                "    vertical-align: middle;\n" +
                "}" +
                ".form-3 input[type=submit] {\n" +
                "    /* Width and position */\n" +
                "    width: 100%;\n" +
                "    padding: 8px 5px;\n" +
                "   \n" +
                "    /* Styles */\n" +
                "    border: 1px solid #0273dd; /* Fallback */\n" +
                "    border: 1px solid rgba(0,0,0,0.4);\n" +
                "    box-shadow:\n" +
                "        inset 0 1px 0 rgba(255,255,255,0.3),\n" +
                "        inset 0 10px 10px rgba(255,255,255,0.1);\n" +
                "    border-radius: 3px;\n" +
                "    background: #38a6f0;\n" +
                "    cursor:pointer;\n" +
                "   \n" +
                "    /* Font styles */\n" +
                "    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +
                "    color: white;\n" +
                "    font-weight: 700;\n" +
                "    font-size: 15px;\n" +
                "    text-shadow: 0 -1px 0 rgba(0,0,0,0.8);\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=submit]:hover {\n" +
                "    box-shadow: inset 0 1px 0 rgba(255,255,255,0.6);\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=submit]:active {\n" +
                "    background: #287db5;\n" +
                "    box-shadow: inset 0 0 3px rgba(0,0,0,0.6);\n" +
                "    border-color: #000; /* Fallback */\n" +
                "    border-color: rgba(0,0,0,0.9);\n" +
                "}\n" +
                " \n" +
                ".no-boxshadow .form-3 input[type=submit]:hover {\n" +
                "    background: #2a92d8;\n" +
                "}" +
                "/* Gradient line */\n" +
                ".form-3:after {\n" +
                "    /* Size and position */\n" +
                "    content: \"\";\n" +
                "    height: 1px;\n" +
                "    width: 33%;\n" +
                "    position: absolute;\n" +
                "    left: 20%;\n" +
                "    top: 0;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    background: linear-gradient(left, transparent, #444, #b6b6b8, #444, transparent);\n" +
                "}\n" +
                " \n" +
                "/* Small flash */\n" +
                ".form-3:before {\n" +
                "    /* Size and position */\n" +
                "    content: \"\";\n" +
                "    width: 8px;\n" +
                "    height: 5px;\n" +
                "    position: absolute;\n" +
                "    left: 34%;\n" +
                "    top: -7px;\n" +
                "     \n" +
                "    /* Styles */\n" +
                "    border-radius: 50%;\n" +
                "    box-shadow: 0 0 6px 4px #fff;\n" +
                "}" +
                ".form-3 p:nth-child(1):before{\n" +
                "    /* Size and position */\n" +
                "    content: \"\";\n" +
                "    width: 250px;\n" +
                "    height: 100px;\n" +
                "    position: absolute;\n" +
                "    top: 0;\n" +
                "    left: 45px;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    transform: rotate(75deg);\n" +
                "    background: linear-gradient(50deg, rgba(255,255,255,0.15), rgba(0,0,0,0));\n" +
                "    pointer-events: none;\n" +
                "}" +
                ".no-pointerevents .form-3 p:nth-child(1):before {\n" +
                "    display: none;\n" +
                "}");
        out.append("</style>");
        out.append("</head>");
        out.append("<body style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>");
        out.append("<form action='/App1_web/' method='POST' class=\"form-3\">\n" +
                "    <p class=\"clearfix\">\n" +
                "        <label for=\"login\">Login</label>\n" +
                "        <input required type=\"text\" name=\"login\" id=\"login\" placeholder=\"Логин\">\n" +
                "    </p>\n" +
                "    <p class=\"clearfix\">\n" +
                "        <label for=\"password\">Password</label>\n" +
                "        <input required type=\"password\" name=\"pass\" id=\"password\" placeholder=\"Пароль\">\n" +
                "    </p>\n" +
                "    <p class=\"clearfix\">\n" +
                "        <input type=\"submit\" name=\"submit\" value=\"Sign In\">\n" +
                "    </p>      \n" +
                "</form>");
        out.append("<form action='/App1_web/register' method='GET' class=\"form-3\">\n" +
                "    <p class=\"clearfix\">\n" +
                "        <input type=\"submit\" name=\"submit\" value=\"Sign Up\">\n" +
                "    </p>      \n" +
                "</form>");
        out.append("</body>");
        out.append("</html>");

        return out.toString();
    }

    public String formCheckedAuthorization(String login, String pass) {

        StringBuilder out = new StringBuilder();
        out.append("<!DOCTYPE html>");
        out.append("<html>");
        out.append("<head>");
        out.append("<title>Success page</title>");
        out.append("</head>");
        out.append("<body>");
        out.append("SUCCESS!!!");
        out.append("<form action='/App1_web/main' method='GET'>");
        out.append("<input type='submit' value='Main Page'/>");
        out.append("</form>");
        out.append("</body>");
        out.append("</html>");

        return out.toString();
    }

    /*
    My methods
     */
    public String formItem(String title, User u, Item i) {
        StringBuilder b = new StringBuilder();
        b.append(formHead(title));
        b.append("<div id='header' style='height: 83px; background-color: aqua'>");
        b.append(generateHeader(u.getLogin()));
        b.append("</div>");

        b.append("<div id='content' style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>");
        b.append("<table width = \"100%\" height = \"100%\">");

        b.append(privateViewOfItem(i));

        b.append("</table>");
        b.append("<form action='/App1_web/main' method='GET'>");
        b.append("<input type='submit' value='Main Page'/>");
        b.append("</form>");
        b.append("</div>");

        b.append(generateFooter());
        b.append(formEnd());
        return b.toString();
    }

    private String generateHeader(String userName) {

        StringBuilder header = new StringBuilder();
        header.append("<table  width = \"100%\" class='goods'");
        header.append("  <tr>");
        header.append("    <td width = '60px' align = 'left'>");
        header.append("      <img src='http://i.piccy.info/i9/db895864e575cb3520c8dd7bfe21a74c/1539106022/1226/1226734/logo.png' style='height: 50px'/>");
        header.append("    </td>");
        header.append("    <td width = '200px' align = 'left'>");
        header.append("      <h1>Weed Store</h1>");
        header.append("    </td>");
        header.append("    <td align='right' width = '100px'>");
        header.append("     <h4>");
        header.append("     <a href = '/App1_web/cart'>Cart</a>");
        header.append("     </h4>");
        header.append("     </td>");
        header.append("    <td align=\"right\" width='100px'>");
        header.append("     <a href='/App1_web/account'><h3>" + userName + "</h3></a>");
        header.append("     </td>");
        header.append("  </tr>");
        header.append("</table>");

        return header.toString();
    }

    //____________________________________________

    private String commonViewOfItem(Item i) {

        StringBuilder b = new StringBuilder();

        b.append("<tr height = \"100%\" style='width: 200px; background-color: antiquewhite'>");
        b.append("    <td align = \"center\">");
        b.append("      <h3>" + i.getName() + "</h3>");
        b.append("<a href='/App1_web/item?id=" + i.getId() + "'><img src='" + i.getsImg() + "' style='height: 200px'/></a>");
        b.append("</td>");
        b.append("<td>");
        b.append("  <table height = \"400px\" width = \"100%\" class=\"goods\">");
        b.append("    <tr style=' background-color: antiquewhite'>");
        b.append("       <td valign = \"top\">");
        b.append("         <h3>Price: " + i.getPrice() + " UAH</h3>");
        b.append("       </td>");
        b.append("    </tr>");
        b.append("    <tr style=' background-color: antiquewhite'>");
        b.append("       <td>");
        b.append("         <h4>Summary: " + i.getAbout() + "</h4>");
        b.append("       </td>");
        b.append("    </tr>");
        b.append("    <tr style='background-color: antiquewhite'>");
        b.append("      <td valign = \"bottom\">");
        b.append("         <h4>Category: " + i.getCat() + "</h4>");
        b.append("      </td>");
        b.append("    </tr>");
        b.append("  </table>");
        b.append("</td>");
        b.append("<td style='width: 100px'>");
        b.append("<h4><a href='/App1_web/cart?id=" + i.getId() + "'>Add to Cart</h4>");
        b.append("</td>");
        b.append("</tr>");
        return b.toString();
    }

    private String privateViewOfItem(Item i) {

        //if mode = true, then generate common view of item
        StringBuilder b = new StringBuilder();

        b.append("<tr height = \"100%\" style='width: 200px; background-color: antiquewhite'>");
        b.append("    <td align = \"center\">");
        b.append("      <h2>" + i.getName() + "</h2>");
        b.append("<img src='" + i.getsImg() + "' style='height: 200px'/>");
        b.append("</td>");
        b.append("<td>");
        b.append("  <table height = \"400px\" width = \"100%\">");
        b.append("    <tr style=' background-color: antiquewhite'>");
        b.append("       <td valign = \"top\">");
        b.append("         <h2>Price: " + i.getPrice() + " UAH</h2>");
        b.append("       </td>");
        b.append("    </tr>");
        b.append("    <tr style=' background-color: antiquewhite'>");
        b.append("       <td>");
        b.append("         <h3>Summary: " + i.getAbout() + "</h3>");
        b.append("       </td>");
        b.append("    </tr>");
        b.append("    <tr style='background-color: antiquewhite'>");
        b.append("      <td valign = \"bottom\">");
        b.append("         <h3>Category: " + i.getCat() + "</h3>");
        b.append("      </td>");
        b.append("    </tr>");
        b.append("  </table>");
        b.append("</td>");
        b.append("<td style='width: 100px'>");
        b.append("<h3><a href='/App1_web/cart?id=" + i.getId() + "'>Add to Cart</h3>");
        b.append("</td>");
        b.append("</tr>");
        return b.toString();
    }

    private String cartViewOfItem(Item i, int amount) {

        StringBuilder b = new StringBuilder();

        b.append("<tr height = \"100%\" style='width: 200px; background-color: antiquewhite'>");
        b.append("    <td align = \"center\">");
        b.append("      <h3>" + i.getName() + "</h3>");
        b.append("<img src='" + i.getsImg() + "' style='height: 200px'/>");
        b.append("</td>");
        b.append("<td>");
        b.append("  <table height = \"400px\" width = \"100%\" ");
        b.append("    <tr style=' background-color: antiquewhite'>");
        b.append("       <td valign = \"top\">");
        b.append("         <h3>Price: " + i.getPrice() * amount + " UAH</h3>");
        b.append("         <br>");
        b.append("         <h3>Amount: " + amount + "</h3>");
        b.append("       </td>");
        b.append("    </tr>");
        b.append("    <tr style=' background-color: antiquewhite'>");
        b.append("       <td>");
        b.append("         <h4>Summary: " + i.getAbout() + "</h4>");
        b.append("       </td>");
        b.append("    </tr>");
        b.append("    <tr style='background-color: antiquewhite'>");
        b.append("      <td valign = \"bottom\">");
        b.append("         <h4>Category: " + i.getCat() + "</h4>");
        b.append("      </td>");
        b.append("    </tr>");
        b.append("  </table>");
        b.append("</td>");
        b.append("<td style='width: 100px'>");
        b.append("<h4 align = 'center'><a href='/App1_web/cart?id=" + i.getId() + "'>" + (i.getName() + "++") + "</h4>");
        b.append("<br>");
        b.append("<h4 align = 'center'><a href='/App1_web/cart?id=-" + i.getId() + "'>" + (i.getName() + "--") + "</h4>");
        b.append("</td>");
        b.append("</tr>");
        return b.toString();
    }

    public String formSearching(String title, User u, List<Item> items, String req) {
        StringBuilder b = new StringBuilder();
        b.append(formHead(title));
        b.append("<div id='header' style='height: 83px; background-color: aqua'>");
        b.append(generateHeader(u.getLogin()));
        b.append("</div>");
        b.append("<table  width = \"100%\"");
        b.append("  <tr>");
        b.append("    <td align = 'left'>");
        b.append("    <h2>You look for \"" + req + "\" </h2>");
        b.append("    </td>");
        b.append("    <td width = '60px' align = 'right'>");
        b.append("          <form action='/App1_web/main' method='GET'>");
        b.append("              <input type='submit' value='Back'/>");
        b.append("          </form>");
        b.append("     </td>");
        b.append("  </tr>");
        b.append("</table>");
        b.append("<div id='content' style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>");
        if (items.size() != 0) {

            b.append("<h1>Items:</h1>");
            b.append("            <table class='goodstable'>");
            for (Item i : items) {
                b.append(commonViewOfItem(i));
            }
            b.append("            </table>");

        } else {

            b.append("<h1>Goods not found</h1>");

        }
        b.append("</div>");
        b.append(generateFooter());
        b.append(formEnd());
        return b.toString();
    }

//________________________________________________

    private String generateFooter() {
        StringBuilder b = new StringBuilder();

        b.append("<div id='footer' style='height: 20px; background-color: azure'>");
        b.append("  <h6>Copyright: Alex, Nikitin,...</h6>");
        b.append("</div>");

        return b.toString();
    }

    public String formCart(List<Item> items, String title, User u) {
        StringBuilder b = new StringBuilder();
        Map<Item, Integer> myMap = new HashMap<>();
        int allSum = 0;
        b.append(formHead(title));
        b.append("<div id='header' style='height: 83px; background-color: aqua'>");
        b.append(generateHeader(u.getLogin()));
        b.append("</div>");
        b.append("<div id='content' style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>");
        b.append("<table width='100%'>");
        b.append("  <tr>");
        b.append("    <td  align = 'left'>");
        b.append("      <h1>Your Cart:</h1>");
        b.append("    </td>");
        b.append("    <td width = '200px' align = 'right'>");
        b.append("<h3><a href='/App1_web/cart?id=0'>Empty cart</h3>");
        b.append("<br>");
        b.append("<h3><a href='/App1_web/main'>Back</h3>");
        b.append("    </td>");
        b.append("  </tr>");
        b.append("</table>");
        b.append("            <table>");
        for (Item i : items) {

            allSum += i.getPrice();
            if (!myMap.containsKey(i)) {
                myMap.put(i, 1);
            } else {
                myMap.put(i, myMap.get(i) + 1);
            }
        }

        for (Item i : myMap.keySet()) {

            b.append(cartViewOfItem(i, myMap.get(i)));
            System.out.println(i.getName() + " " + myMap.get(i));
        }
        b.append("            </table>");

        b.append("<table width='100%'>");
        b.append("  <tr>");
        b.append("      <td align = 'right'>");
        b.append("  <h2> Total sum: " + allSum + " UAH</h2>");
        b.append("      </td>");
        b.append("  </tr>");
        b.append("            </table>");

        b.append("</div>");
        b.append(generateFooter());
        b.append(formEnd());
        return b.toString();
    }

    public String formUserAccount(User u) {

        StringBuilder out = new StringBuilder();

        out.append("<!DOCTYPE html>");
        out.append("<html>");
        out.append("<head>");
        out.append("<title>Login page</title>");
        out.append("<style type='text/css'>");
        out.append(".form-3 {\n" +
                "    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +
                "    font-weight: 400;\n" +
                "    /* Size and position */\n" +
                "    width: 350px;\n" +
                "    position: relative;\n" +
                "    margin: 60px auto 30px;\n" +
                "    padding: 10px;\n" +
                "    overflow: hidden;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    background: #111;\n" +
                "    border-radius: 0.4em;\n" +
                "    border: 1px solid #191919;\n" +
                "    box-shadow:\n" +
                "        inset 0 0 2px 1px rgba(255,255,255,0.08),\n" +
                "        0 16px 10px -8px rgba(0, 0, 0, 0.6);\n" +
                "}" +
                ".form-3 label {\n" +
                "    /* Size and position */\n" +
                "    width: 95%;\n" +
                "    float: left;\n" +
                "    padding-top: 9px;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    color: #ddd;\n" +
                "    font-size: 12px;\n" +
                "    text-transform: uppercase;\n" +
                "    letter-spacing: 1px;\n" +
                "    text-shadow: 0 1px 0 #000;\n" +
                "    text-indent: 10px;\n" +
                "    font-weight: 700;\n" +
                "    cursor: pointer;\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=text],\n" +
                ".form-3 input[type=password] {\n" +
                "    /* Size and position */\n" +
                "    width: 95%;\n" +
                "    float: left;\n" +
                "    padding: 8px 5px;\n" +
                "    margin-bottom: 10px;\n" +
                "    font-size: 12px;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    background: linear-gradient(#1f2124, #27292c);   \n" +
                "    border: 1px solid #000;\n" +
                "    box-shadow:\n" +
                "        0 1px 0 rgba(255,255,255,0.1);\n" +
                "    border-radius: 3px;\n" +
                " \n" +
                "    /* Font styles */\n" +
                "    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +
                "    color: #fff;\n" +
                " \n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=text]:hover,\n" +
                ".form-3 input[type=password]:hover,\n" +
                ".form-3 label:hover ~ input[type=text],\n" +
                ".form-3 label:hover ~ input[type=password] {\n" +
                "    background: #27292c;\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=text]:focus,\n" +
                ".form-3 input[type=password]:focus {\n" +
                "    box-shadow: inset 0 0 2px #000;\n" +
                "    background: #494d54;\n" +
                "    border-color: #51cbee;\n" +
                "    outline: none; /* Remove Chrome outline */\n" +
                "}" +
                ".form-3 p:nth-child(3),\n" +
                ".form-3 p:nth-child(4) {\n" +
                "    float: left;\n" +
                "    width: 50%;\n" +
                "}" +
                ".form-3 label[for=remember] {\n" +
                "    width: auto;\n" +
                "    float: none;\n" +
                "    display: inline-block;\n" +
                "    text-transform: capitalize;\n" +
                "    font-size: 11px;\n" +
                "    font-weight: 400;\n" +
                "    letter-spacing: 0px;\n" +
                "    text-indent: 2px;\n" +
                "}\n" +
                ".form-3 input[type=submit] {\n" +
                "    /* Width and position */\n" +
                "    width: 100%;\n" +
                "    padding: 8px 5px;\n" +
                "   \n" +
                "    /* Styles */\n" +
                "    border: 1px solid #0273dd; /* Fallback */\n" +
                "    border: 1px solid rgba(0,0,0,0.4);\n" +
                "    box-shadow:\n" +
                "        inset 0 1px 0 rgba(255,255,255,0.3),\n" +
                "        inset 0 10px 10px rgba(255,255,255,0.1);\n" +
                "    border-radius: 3px;\n" +
                "    background: #38a6f0;\n" +
                "    cursor:pointer;\n" +
                "   \n" +
                "    /* Font styles */\n" +
                "    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +
                "    color: white;\n" +
                "    font-weight: 700;\n" +
                "    font-size: 15px;\n" +
                "    text-shadow: 0 -1px 0 rgba(0,0,0,0.8);\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=submit]:hover {\n" +
                "    box-shadow: inset 0 1px 0 rgba(255,255,255,0.6);\n" +
                "}\n" +
                " \n" +
                ".form-3 input[type=submit]:active {\n" +
                "    background: #287db5;\n" +
                "    box-shadow: inset 0 0 3px rgba(0,0,0,0.6);\n" +
                "    border-color: #000; /* Fallback */\n" +
                "    border-color: rgba(0,0,0,0.9);\n" +
                "}\n" +
                " \n" +
                ".no-boxshadow .form-3 input[type=submit]:hover {\n" +
                "    background: #2a92d8;\n" +
                "}" +
                "/* Gradient line */\n" +
                ".form-3:after {\n" +
                "    /* Size and position */\n" +
                "    content: \"\";\n" +
                "    height: 1px;\n" +
                "    width: 33%;\n" +
                "    position: absolute;\n" +
                "    left: 20%;\n" +
                "    top: 0;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    background: linear-gradient(left, transparent, #444, #b6b6b8, #444, transparent);\n" +
                "}\n" +
                " \n" +
                "/* Small flash */\n" +
                ".form-3:before {\n" +
                "    /* Size and position */\n" +
                "    content: \"\";\n" +
                "    width: 8px;\n" +
                "    height: 5px;\n" +
                "    position: absolute;\n" +
                "    left: 34%;\n" +
                "    top: -7px;\n" +
                "     \n" +
                "    /* Styles */\n" +
                "    border-radius: 50%;\n" +
                "    box-shadow: 0 0 6px 4px #fff;\n" +
                "}" +
                ".form-3 p:nth-child(1):before{\n" +
                "    /* Size and position */\n" +
                "    content: \"\";\n" +
                "    width: 250px;\n" +
                "    height: 100px;\n" +
                "    position: absolute;\n" +
                "    top: 0;\n" +
                "    left: 45px;\n" +
                " \n" +
                "    /* Styles */\n" +
                "    transform: rotate(75deg);\n" +
                "    background: linear-gradient(50deg, rgba(255,255,255,0.15), rgba(0,0,0,0));\n" +
                "    pointer-events: none;\n" +
                "}" +
                ".no-pointerevents .form-3 p:nth-child(1):before {\n" +
                "    display: none;\n" +
                "}");
        out.append("</style>");
        out.append("</head>");
        out.append("<body style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>");
        out.append("<form action='/App1_web/account' method='GET' class=\"form-3\">\n" +
                "    <p class=\"clearfix\">\n" +
                "        <label for=\"login\">" + u.getLogin() + "</label>\n" +
                "        <input type=\"text\" name=\"login\" id=\"login\" placeholder=\"Input new login\">\n" +
                "    </p>\n" +
                "    <p class=\"clearfix\">\n" +
                "        <label for=\"pass1\">Change password</label>\n" +
                "        <input type=\"password\" name=\"pass1\" id=\"pass1\" placeholder=\"Input old password\">\n" +
                "    </p>\n" +
                "<p class=\"clearfix\">\n" +
                "        <input style='width: 95%' type=\"password\" name=\"pass2\" id=\"pass2\" placeholder=\"Input new password\">\n" +
                "    </p><br>\n" +
                "<p class=\"clearfix\">\n" +
                "        <label for=\"phone\">" + u.getPhone() + "</label>\n" +
                "        <input type=\"text\" name=\"phone\" id=\"phone\" placeholder=\"Input new phone number\">\n" +
                "    </p>\n" +
                "<p class=\"clearfix\">\n" +
                "        <label for=\"city\">" + u.getCity() + "</label>\n" +
                "        <input type=\"text\" name=\"city\" id=\"city\" placeholder=\"Input new city\">\n" +
                "    </p>\n" +
                "    <p class=\"clearfix\">\n" +
                "        <input type=\"submit\" name=\"submit\" value=\"Change data\">\n" +
                "    </p>      \n" +
                "</form>");
        out.append("<form action='/App1_web/main' method='GET' class=\"form-3\">\n" +
                "    <p class=\"clearfix\">\n" +
                "        <input type=\"submit\" name=\"submit\" value=\"Back\">\n" +
                "    </p>      \n" +
                "</form>");
        out.append("</body>");
        out.append("</html>");

        return out.toString();
    }
}


/*
cart view
        b.append("          <form action='/App1_web/cart?id=0' method='GET'>");
        b.append("              <input type='submit' value='Empty Cart'/>");
        b.append("          </form>");
        b.append("          <form action='/App1_web/main' method='GET'>");
        b.append("              <input type='submit' value='Back'/>");
        b.append("          </form>");*/

/*public String formAuthorization() {

        StringBuilder out = new StringBuilder();

        out.append("<!DOCTYPE html>");
        out.append("<html>");
        out.append("<head>");
        out.append("<title>Login page</title>");
        out.append("</head>");
        out.append("<body>");
        out.append("<form action='/App1_web/' method='POST'>");
        out.append("            Input login:<input value = 'valera' name='login'/><br/>");
        out.append("            Input password:<input value = '1111' type='password' name='pass'/><br/>");
        out.append("            <input type='submit' value='Authorize Me'/>");
        out.append("        </form>");
        out.append("<form action='/App1_web/register' method='GET'>");
        out.append("            <input type='submit' value='Register'/>");
        out.append("        </form>");
        out.append("</body>");
        out.append("</html>");

        return out.toString();
    }*/
/*

b.append("table {\n" +
                "font-family: \"Lucida Sans Unicode\", \"Lucida Grande\", Sans-Serif;\n" +
                "font-size: 14px;\n" +
                "border-collapse: collapse;\n" +
                "text-align: center;\n" +
                "color: white;\n" +
                "}\n" +
                "th, td {\n" +
                "border-style: solid;\n" +
                "border-width: 0 1px 1px 0;\n" +
                "}\n" +
                "td {\n" +
                "background: #F08080;\n" +
                "background: linear-gradient(#1f2124, #27292c);   \n" +
                "}\n" +
                "th:first-child, td:first-child {\n" +
                "text-align: left;\n" +
                "}");
        b.append("</style>");
 */

/*
public String formRegister(String title) {
        StringBuilder b = new StringBuilder();
        b.append(formHead(title));
        b.append("<form action='/App1_web/register' method='POST'>");
        b.append("Input login:<input name='login'/><br/>");
        b.append("Input password:<input type='password' name='pass1'/><br/>");
        b.append("Input again:<input type='password' name='pass2'/><br/>");
        b.append("Input phone:<input name='phone'/><br/>");
        b.append("Input city:<input name='city'/><br/>");
        b.append("<input type='submit' value='Register Me'/>");
        b.append("</form>");
        b.append("<form action='/App1_web/' method='GET'>");
        b.append("<input type='submit' value='Log In'/>");
        b.append("</form>");
        b.append(formEnd());
        return b.toString();
    }

 */