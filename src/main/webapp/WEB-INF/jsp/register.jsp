<!DOCTYPE html>
<html>
<head>
    <title>Login page</title>

</head>
<body style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>

<table align='center' style="background-image: url(http://365psd.ru/images/backgrounds/bg-light-4818.png)">

    <tr>
        <td align='right'>
            <form action='/App1_web/register' method='POST' >
                <p >
                    
                    Login:<input required type='text' name='login' placeholder='Input login'>
                </p>
                <p >
                    
                    Password:<input required type='password' name='pass1' placeholder='Input password'>
                </p>
                <p >
                    
                    <input required  type='password' name='pass2' placeholder='Input password again'>
                </p>
                <p >
                    
                    <input required type='text' name='phone' id='phone' placeholder='Input phone number'>
                </p>
                <p >
                    
                    <input required type='text' name='city' placeholder='Input city'>
                </p>
                <p align='center'>
                    <input type='submit' value='Sign Up'>
                </p>
            </form>
            <form action='/App1_web/' method='GET' >
                <p align='center'>
                    <input type='submit' value='Sign In'>
                </p>
            </form>
        </td>
    </tr>
</table>

</body>
</html> 