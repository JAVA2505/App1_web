<tr height = \"100%\" style='width: 200px; background-color: antiquewhite'>
    <td align = \"center\">
          <h3>" + i.getName(</h3>
    <img src='" + i.getsImg(' style='height: 200px'/>
    </td>
<td>
  <table height = \"400px\" width = \"100%\" >
    <tr style=' background-color: antiquewhite'>
           <td valign = \"top\">
                 <h3>Price: " + i.getPrice() * amount + " UAH</h3>
                 <br>
                 <h3>Amount: " + amount + "</h3>
               </td>
        </tr>
    <tr style=' background-color: antiquewhite'>
           <td>
                 <h4>Summary: " + i.getAbout(</h4>
               </td>
        </tr>
    <tr style='background-color: antiquewhite'>
          <td valign = \"bottom\">
                 <h4>Category: " + i.getCat(</h4>
              </td>
        </tr>
  </table>
</td>
<td style='width: 100px'>
    <h4 align = 'center'><a href='/App1_web/cart?id=" + i.getId()'>i.getName()++</a></h4>
<br>
    <h4 align = 'center'><a href='/App1_web/cart?id=-" + i.getId()'>i.getName()--</a></h4>
</td>
</tr>