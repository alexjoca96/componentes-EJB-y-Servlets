<%-- 
    Document   : insertar_empleado
    Created on : 20-feb-2022, 23:59:34
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
            <input type="hidden" name="instruccion" value="insertar_empleado">
           Nombre de Usuario :<input type="text" name="nombreUsuario">
           <br><br>
           Nombre Completo:<input type="text" name="nombreCompleto">
           <br><br>
           Password :<input type="text" name="Password">
           <br><br>
           Telefono:<input type="text" name="Telefono">
           <br><br>
           <input type="submit" name="enviar" value="Enviar">
            
        </form> 
    </body>
</html>
