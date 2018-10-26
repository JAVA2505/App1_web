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
    <style type='text/css'>
        .form-3 {
            font-family: 'Ubuntu', 'Lato', sans-serif;
            font-weight: 400;
            /* Size and position */
            width: 350px;
            position: relative;
            margin: 60px auto 30px;
            padding: 10px;
            overflow: hidden;
            /* Styles */
            background: #111;
            border-radius: 0.4em;
            border: 1px solid #191919;
            box-shadow: inset 0 0 2px 1px rgba(255, 255, 255, 0.08),
            0 16px 10px -8px rgba(0, 0, 0, 0.6);
        }

        .form-3 label {
            /* Size and position */
            width: 95%;
            float: left;
            padding-top: 9px;
            /* Styles */
            color: #ddd;
            font-size: 12px;
            text-transform: uppercase;
            letter-spacing: 1px;
            text-shadow: 0 1px 0 #000;
            text-indent: 10px;
            font-weight: 700;
            cursor: pointer;
        }

        /*".form-3 input[type=text],\n" +*/
        /*".form-3 input[type=password] {\n" +*/
        /*"    !* Size and position *!\n" +*/
        /*"    width: 95%;\n" +*/
        /*"    float: left;\n" +*/
        /*"    padding: 8px 5px;\n" +*/
        /*"    margin-bottom: 10px;\n" +*/
        /*"    font-size: 12px;\n" +*/
        /*" \n" +*/
        /*"    !* Styles *!\n" +*/
        /*"    background: linear-gradient(#1f2124, #27292c);   \n" +*/
        /*"    border: 1px solid #000;\n" +*/
        /*"    box-shadow:\n" +*/
        /*"        0 1px 0 rgba(255,255,255,0.1);\n" +*/
        /*"    border-radius: 3px;\n" +*/
        /*" \n" +*/
        /*"    !* Font styles *!\n" +*/
        /*"    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +*/
        /*"    color: #fff;\n" +*/
        /*" \n" +*/
        /*"}\n" +*/
        /*" \n" +*/
        /*".form-3 input[type=text]:hover,\n" +*/
        /*".form-3 input[type=password]:hover,\n" +*/
        /*".form-3 label:hover ~ input[type=text],\n" +*/
        /*".form-3 label:hover ~ input[type=password] {\n" +*/
        /*"    background: #27292c;\n" +*/
        /*"}\n" +*/
        /*" \n" +*/
        /*".form-3 input[type=text]:focus,\n" +*/
        /*".form-3 input[type=password]:focus {\n" +*/
        /*"    box-shadow: inset 0 0 2px #000;\n" +*/
        /*"    background: #494d54;\n" +*/
        /*"    border-color: #51cbee;\n" +*/
        /*"    outline: none; !* Remove Chrome outline *!\n" +*/
        /*"}" +*/
        /*".form-3 p:nth-child(3),\n" +*/
        /*".form-3 p:nth-child(4) {\n" +*/
        /*"    float: left;\n" +*/
        /*"    width: 95%;\n" +*/
        /*"}" +*/
        /*".form-3 label[for=remember] {\n" +*/
        /*"    width: auto;\n" +*/
        /*"    float: left;\n" +*/
        /*"    display: inline-block;\n" +*/
        /*"    text-transform: capitalize;\n" +*/
        /*"    font-size: 11px;\n" +*/
        /*"    font-weight: 400;\n" +*/
        /*"    letter-spacing: 0px;\n" +*/
        /*"    text-indent: 2px;\n" +*/
        /*"}\n" +*/
        /*" \n" +*/
        /*".form-3 input[type=checkbox] {\n" +*/
        /*"    margin-left: 10px;\n" +*/
        /*"    vertical-align: middle;\n" +*/
        /*"}" +*/
        /*".form-3 input[type=submit] {\n" +*/
        /*"    !* Width and position *!\n" +*/
        /*"    width: 100%;\n" +*/
        /*"    padding: 8px 5px;\n" +*/
        /*"   \n" +*/
        /*"    !* Styles *!\n" +*/
        /*"    border: 1px solid #0273dd; !* Fallback *!\n" +*/
        /*"    border: 1px solid rgba(0,0,0,0.4);\n" +*/
        /*"    box-shadow:\n" +*/
        /*"        inset 0 1px 0 rgba(255,255,255,0.3),\n" +*/
        /*"        inset 0 10px 10px rgba(255,255,255,0.1);\n" +*/
        /*"    border-radius: 3px;\n" +*/
        /*"    background: #38a6f0;\n" +*/
        /*"    cursor:pointer;\n" +*/
        /*"   \n" +*/
        /*"    !* Font styles *!\n" +*/
        /*"    font-family: 'Ubuntu', 'Lato', sans-serif;\n" +*/
        /*"    color: white;\n" +*/
        /*"    font-weight: 700;\n" +*/
        /*"    font-size: 15px;\n" +*/
        /*"    text-shadow: 0 -1px 0 rgba(0,0,0,0.8);\n" +*/
        /*"}\n" +*/
        /*" \n" +*/
        /*".form-3 input[type=submit]:hover {\n" +*/
        /*"    box-shadow: inset 0 1px 0 rgba(255,255,255,0.6);\n" +*/
        /*"}\n" +*/
        /*" \n" +*/
        /*".form-3 input[type=submit]:active {\n" +*/
        /*"    background: #287db5;\n" +*/
        /*"    box-shadow: inset 0 0 3px rgba(0,0,0,0.6);\n" +*/
        /*"    border-color: #000; !* Fallback *!\n" +*/
        /*"    border-color: rgba(0,0,0,0.9);\n" +*/
        /*"}\n" +*/
        /*" \n" +*/
        /*".no-boxshadow .form-3 input[type=submit]:hover {\n" +*/
        /*"    background: #2a92d8;\n" +*/
        /*"}" +*/
        /*"!* Gradient line *!\n" +*/
        /*".form-3:after {\n" +*/
        /*"    !* Size and position *!\n" +*/
        /*"    content: \"\";\n" +*/
        /*"    height: 1px;\n" +*/
        /*"    width: 33%;\n" +*/
        /*"    position: absolute;\n" +*/
        /*"    left: 20%;\n" +*/
        /*"    top: 0;\n" +*/
        /*" \n" +*/
        /*"    !* Styles *!\n" +*/
        /*"    background: linear-gradient(left, transparent, #444, #b6b6b8, #444, transparent);\n" +*/
        /*"}\n" +*/
        /*" \n" +*/
        /*"!* Small flash *!\n" +*/
        /*".form-3:before {\n" +*/
        /*"    !* Size and position *!\n" +*/
        /*"    content: \"\";\n" +*/
        /*"    width: 8px;\n" +*/
        /*"    height: 5px;\n" +*/
        /*"    position: absolute;\n" +*/
        /*"    left: 34%;\n" +*/
        /*"    top: -7px;\n" +*/
        /*"     \n" +*/
        /*"    !* Styles *!\n" +*/
        /*"    border-radius: 50%;\n" +*/
        /*"    box-shadow: 0 0 6px 4px #fff;\n" +*/
        /*"}" +*/
        /*".form-3 p:nth-child(1):before{\n" +*/
        /*"    !* Size and position *!\n" +*/
        /*"    content: \"\";\n" +*/
        /*"    width: 250px;\n" +*/
        /*"    height: 100px;\n" +*/
        /*"    position: absolute;\n" +*/
        /*"    top: 0;\n" +*/
        /*"    left: 45px;\n" +*/
        /*" \n" +*/
        /*"    !* Styles *!\n" +*/
        /*"    transform: rotate(75deg);\n" +*/
        /*"    background: linear-gradient(50deg, rgba(255,255,255,0.15), rgba(0,0,0,0));\n" +*/
        /*"    pointer-events: none;\n" +*/
        /*"}" +*/
        /*".no-pointerevents .form-3 p:nth-child(1):before {\n" +*/
        /*"    display: none;\n" +*/
        /*"}");*/
    </style>
</head>
<body style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>
<form action='/App1_web/' method='POST' class="form-3">
    <p class="clearfix">
        <label for="login">Login</label>
        <input required type="text" name="login" id="login" placeholder="Логин">
    </p>
    <p class="clearfix">
        <label for="password">Password</label>
        <input required type="password" name="pass" id="password" placeholder="Пароль">
    </p>
    <p class="clearfix">
        <input type="submit" name="submit" value="Sign In">
    </p>
</form>
<form action='/App1_web/register' method='GET' class="form-3">
    <p class="clearfix">
        <input type="submit" name="submit" value="Sign Up">
    </p>
</form>
</body>
</html>
