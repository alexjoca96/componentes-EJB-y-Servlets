<%-- 
    Document   : ultima
    Created on : 23-feb-2022, 20:12:10
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
            <input type="hidden" name="instruccion" value="ultima_sesion">
          
           Nombre de usuario del Empleado :<input type="text" name="empleado">
      
           <input type="submit" name="enviar" value="Enviar">
            
        </form> 
    </body>
</html>
