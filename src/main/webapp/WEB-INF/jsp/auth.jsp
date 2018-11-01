<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 26.10.2018
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login page</title>

</head>
<body style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>

<table align='center' style="background-image: url(http://365psd.ru/images/backgrounds/bg-light-4818.png)">

    <tr>
        <td align='right'>
            <form action='/App1_web/' method='POST'>

                <p>
                Login:<input required type="text" name="login" placeholder="Input login">
                </p>

                <p>
                Password:<input required type="password" name="pass" placeholder="Input password">
                </p>
                <p align='center'>
                <input type="submit" value="Sign In">
                </p>
            </form>
            <form action='/App1_web/register' method='GET'>
                <p align='center'>
                    <input type="submit" value="Sign Up">
                </p>
            </form>
        </td>
    </tr>
</table>


</body>
</html>
