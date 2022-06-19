<%-- 
    Document   : singup
    Created on : Jun 19, 2022, 11:06:03 PM
    Author     : dthie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/loginandsingup.css" />
    </head>
    <body>
        <div class="login_signup">
            <div class="form">
                <form class="singup-form" action="singup" method="posr">
                    <input type="text" name="username" placeholder="username">
                    <br><input type="text" name="password" placeholder="password">
                    <br><input type="text" name="password" placeholder="repassword">
                    <br><button>login</button>
                    <p class="message">Already registered? <a href="#">Sign In</a></p>
                </form>
                
            </div>
        </div>
    </body>
</html>
