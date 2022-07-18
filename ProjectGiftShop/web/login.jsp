<%-- 
    Document   : login
    Created on : Jun 19, 2022, 10:38:54 PM
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
                <form class="login-form" action="login" method="post">
                    <input type="text" placeholder="Username" name="username" required/>
                    <br><input type="text" placeholder="Password" name="password" required/>
                    <br><button>login</button>
                    <p class="message">If you want registered, please click: <a href="signup.jsp">Create an account</a></p>
                </form>
            </div>
        </div>
    </body>
</html>
