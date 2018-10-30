<!DOCTYPE html>
<html>
<head>
<title>
Main Page
</title>

<style type='text/css'>
table { 
font-family: 'Lucida Sans Unicode', 'Lucida Grande', Sans-Serif; 
font-size: 14px; 
border-collapse: collapse; 
text-align: center; 
color: white; 
} 
td { 
background: linear-gradient(#1f2124, #27292c);
} 
th:first-child, td:first-child { 
text-align: left; 
}
</style>

</head>
<body link='#40E0D0' vlink='#F5FFFA' alink='#ff0000' bgcolor='orange'>
<div id='header' style='height: 83px; background-color: aqua'>
b.append(generateHeader(u.getLogin()));
</div>
<table  width = '100%' class='goods'>
  <tr>
        <td align = 'left'>

            </td>
        <td width = '60px' align = 'right'>
                  <form action='/main' method='GET'>
                          Search:<input name='q'/><br/>
                          <input type='submit' value='Search'/>
                      </form>
             </td>
      </tr>
</table>
<div id='content' style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>
<h1>Items:</h1>
            <table class='goods'>
    for (Item i : items) {
    b.append(commonViewOfItem(i));
    }
                </table>
</div>
<div id='footer' style='height: 20px; background-color: azure'>
  <h6>Copyright: Alex, Nikitin,...</h6>
</div>
</body>
</html>