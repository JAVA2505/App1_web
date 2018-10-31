<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>
        Main Page
    </title>
</head>
<body>
<div id='header'>

</div>
<div id='content'>
<h1>Items:</h1>
    <table class='goods'>

        <c:forEach items="${items}" var="item">
            <tr>
                <td>
                    <h1>${item.name}</h1>
                    <a href="/App1_web/item?id=${item.id}">
                        <img src="${item.sImg}" width="200px"/>
                    </a>
                    <h2>Price: ${item.price}UAH</h2>
                </td>

                <td>
                        ${item.about}
                </td>
                <td>
                    <a href="/App1_web/cart?id=${item.id}">
                        <input type="submit" value="Add To Cart"/>
                    </a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>
<div id='footer'>
    <h6>Copyright: Alex, Nikitin,...</h6>
</div>
</body>
</html>