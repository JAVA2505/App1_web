package html;

import entity.Item;
import entity.User;

import java.util.List;

public class HtmlFormer {

    private String formHead(String title) {
        StringBuilder b = new StringBuilder();
        b.append("<!DOCTYPE html>");
        b.append("<html>");
        b.append("<head>");
        b.append("<title>");
        b.append(title);
        b.append("</title>");
        b.append("</head>");
        b.append("<body>");
        return b.toString();
    }

    private String formEnd() {
        StringBuilder b = new StringBuilder();
        b.append("</body>");
        b.append("</html>");
        return b.toString();
    }

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
        //TODO add search div with text field and search button
        b.append("<div id='content' style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>");
        b.append("<h1>Items:</h1>");
        b.append("            <table>");
        for (Item i : items) {
            b.append(generateViewOfItem(true, i));

        }
        b.append("            </table>");
        b.append("</div>");
        b.append(generateFooter());
        b.append(formEnd());
        return b.toString();
    }


    public String formAuthorization() {

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
    }

    public String formCheckedAuthorization(String login, String pass) {

        StringBuilder out = new StringBuilder();
        /* TODO output your page here. You may use following sample code. */
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

        b.append(generateViewOfItem(false, i));

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
        header.append("<table  width = \"100%\"");
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
        header.append("     <h3>" + userName + "</h3>");
        header.append("     </td>");
        header.append("  </tr>");
        header.append("</table>");

        return header.toString();
    }

    private String generateViewOfItem(boolean mode, Item i) {

        //if mode = true, then generate common view of item
        StringBuilder b = new StringBuilder();

        b.append("<tr height = \"100%\" style='width: 200px; background-color: antiquewhite'>");
        b.append("    <td align = \"center\">");
        b.append("      <h" + ((mode) ? 3 : 2) + ">" + i.getName() + "</h" + ((mode) ? 3 : 2) + ">");
        b.append(((mode) ? ("<a href='/App1_web/item?id=" + i.getId() + "'>") : ("")) + "<img src='" + i.getsImg() + "' style='height: 200px'/>" + ((mode) ? "</a>" : ""));
        b.append("</td>");
        b.append("<td>");
        b.append("  <table height = \"400px\" width = \"100%\"> ");
        b.append("    <tr style=' background-color: antiquewhite'>");
        b.append("       <td valign = \"top\">");
        b.append("         <h" + ((mode) ? 3 : 2) + ">Price: " + i.getPrice() + " UAH</h" + ((mode) ? 3 : 2) + ">");
        b.append("       </td>");
        b.append("    </tr>");
        b.append("    <tr style=' background-color: antiquewhite'>");
        b.append("       <td>");
        b.append("         <h" + ((mode) ? 4 : 3) + ">Summary: " + i.getAbout() + "</h" + ((mode) ? 4 : 3) + ">");
        b.append("       </td>");
        b.append("    </tr>");
        b.append("    <tr style='background-color: antiquewhite'>");
        b.append("      <td valign = \"bottom\">");
        b.append("         <h" + (mode ? 4 : 3) + ">Category: " + i.getCat() + "</h" + ((mode) ? 4 : 3) + ">");
        b.append("      </td>");
        b.append("    </tr>");
        b.append("  </table>");
        b.append("</td>");
        b.append("<td style='width: 100px'>");
        b.append("<h" + ((mode) ? 4 : 3) + "><a href='/App1_web/cart?id=" + i.getId() + "'>Add to Cart</h" + ((mode) ? 4 : 3) + ">");
        b.append("</td>");
        b.append("</tr>");
        return b.toString();
    }

    private String generateFooter() {
        StringBuilder b = new StringBuilder();

        b.append("<div id='footer' style='height: 20px; background-color: azure'>");
        b.append("  <h6>Copyright: Alex, Nikitin,...</h6>");
        b.append("</div>");

        return b.toString();
    }

    public String formCart(List<Item> items, String title, User u) {
        StringBuilder b = new StringBuilder();
        b.append(formHead(title));
        b.append("<div id='header' style='height: 83px; background-color: aqua'>");
        b.append(generateHeader(u.getLogin()));
        b.append("</div>");
        b.append("<div id='content' style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>");
        b.append("<h1>Your Cart:</h1>");
        b.append("            <table>");
        for (Item i : items) {
            b.append(generateViewOfItem(true, i));

        }
        b.append("            </table>");
        b.append("</div>");
        b.append(generateFooter());
        b.append(formEnd());
        return b.toString();
    }
}
