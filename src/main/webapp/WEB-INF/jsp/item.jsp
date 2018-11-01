<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>
        ${item.name}
    </title>
</head>
<body link='#40E0D0' vlink='#F5FFFA' alink='#ff0000' bgcolor='orange'>
<div id='header' style='height: 83px; background-color: aqua'>
    <table width='100%'>
        <tr>
            <td width='60px' align='left'>
                <img src='http://i.piccy.info/i9/db895864e575cb3520c8dd7bfe21a74c/1539106022/1226/1226734/logo.png'
                     style='height: 50px'/>
            </td>
            <td width='200px' align='left'>
                <h1>Weed Store</h1>
            </td>
            <td align='right' width='100px'>
                <h4>
                    <a href='/App1_web/cart'>Cart</a>
                </h4>
            </td>
            <td align='right' width='100px'>
                <a href='/App1_web/account'><h3>${user.login} </h3></a>
            </td>
        </tr>
    </table>
</div>
<div align='right'><a href = '/App1_web/main'><input type='submit' value='Back'/></a></div>
<div id='content'
     style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>
    <table width='100%' height='100%'>

        <tr height='100%' style='width: 200px; background-color: antiquewhite'>
            <td align='center'>
                <h2>${item.name}</h2>
                <img src='${item.sImg}' style='height: 200px'/>
            </td>
            <td>
                <table height='400px' width='100%'>
                    <tr style=' background-color: antiquewhite'>
                        <td valign='top'>
                            <h2>Price: ${item.price} UAH</h2>
                        </td>
                    </tr>
                    <tr style=' background-color: antiquewhite'>
                        <td>
                            <h3>Summary: ${item.about}</h3>
                        </td>
                    </tr>
                    <tr style='background-color: antiquewhite'>
                        <td valign='bottom'>
                            <h3>Category: ${item.cat}</h3>
                        </td>
                    </tr>
                </table>
            </td>
            <td style='width: 100px'>
                <h3><a href='/App1_web/cart?id=${item.id}'>Add to Cart</a></h3>
            </td>
        </tr>

    </table>



</div>

<div id='footer' style='height: 20px; background-color: azure'>
    <h6>Copyright: Alex, Nikitin,...</h6>
</div>
</body>
</html>