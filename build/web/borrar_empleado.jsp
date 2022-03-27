<%-- 
    Document   : borrar_empleado
    Created on : 21-feb-2022, 10:31:38
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
            <input type="hidden" name="instruccion" value="borrar_empleado">
           Nombre de Usuario :<input type="text" name="nombreUsuario">
           <br><br>
          
           <input type="submit" name="enviar" value="Enviar">
            
        </form> 
    </body>
</html>
