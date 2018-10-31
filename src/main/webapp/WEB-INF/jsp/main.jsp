<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>
        Weed Store
    </title>
</head>
<body>
<table width='100%' class='goods'>
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
<div id='header'>
    <table width='100%' class='goods'>
        <tr>

            <td width='60px' align='right'>
                <form action='/App1_web/main' method='GET'>
                    Search:<input name='q'/><br/>
                    <input type='submit' value='Search'/>
                </form>
            </td>
        </tr>
    </table>
</div>
<div id='content'>
    <h1>Items:</h1>
    <table class='goods'>
        <c:forEach items="${items}" var="item">
            <tr height='100%' style='width: 200px; background-color: antiquewhite'>
                <td align='center'>
                    <h3>${item.name}</h3>
                    <a href='/App1_web/item?id=${item.id}'><img src='${item.sImg}' style='height: 200px'/></a>
                </td>
                <td>
                    <table height='400px' width='100%' class='goods'>
                        <tr style=' background-color: antiquewhite'>
                            <td valign='top'>
                                <h3>Price: ${item.price} UAH</h3>
                            </td>
                        </tr>
                        <tr style=' background-color: antiquewhite'>
                            <td>
                                <h4>Summary: ${item.about}</h4>
                            </td>
                        </tr>
                        <tr style='background-color: antiquewhite'>
                            <td valign='bottom'>
                                <h4>Category: ${item.cat} </h4>
                            </td>
                        </tr>
                    </table>
                </td>
                <td style='width: 100px'>
                    <h4><a href='/App1_web/cart?id=${item.id}'>Add to Cart</a></h4>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>
<div id='footer'>
    <h6 align='center'>Copyright: Alex, Nikitin,...</h6>
</div>
</body>
</html>