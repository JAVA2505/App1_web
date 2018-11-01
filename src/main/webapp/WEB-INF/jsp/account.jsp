 <!DOCTYPE html> 
 <html> 
 <head> 
 <title>Login page</title> 

 </head> 
 <body style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>

 <table align='center' style="background-image: url(http://365psd.ru/images/backgrounds/bg-light-4818.png)">

     <tr>
         <td align='right'>
             <form action='/App1_web/account' method='GET'>
                 <p >

                     Login:<input type='text' name='login' placeholder='Input new login'>
                 </p>
                 <p >

                     Old password:<input type='password' name='pass1' placeholder='Input old password'>
                 </p>
                 <p >
                     New password:<input type='password' name='pass2' placeholder='Input new password'>
                 </p>
                 <p >

                     New phone:<input type='text' name='phone' placeholder='Input new phone number'>
                 </p>
                 <p >

                     New city:<input type='text' name='city' placeholder='Input new city'>
                 </p>
                 <p align='center'>
                     <input type='submit' value='Change data'>
                 </p>
             </form>
             <form action='/App1_web/main' method='GET'>
                 <p align='center'>
                     <input type='submit' value='Back'>
                 </p>
             </form>
         </td>
     </tr>
 </table>
 
 
 </body> 
 </html> 