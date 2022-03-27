<%-- 
    Document   : cambiar_contrasena
    Created on : 21-feb-2022, 10:49:45
    Author     : alexa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="NewServlet" method="POST">
            <input type="hidden" name="instruccion" value="cambiar_contrasena">
           Nombre de Usuario :<input type="text" name="nombreUsuario">
           <br><br>
           Nueva Password :<input type="text" name="Password">
           <input type="submit" name="enviar" value="Enviar">
            
        </form> 
    </body>
</html>
