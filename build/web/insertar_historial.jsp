<%-- 
    Document   : insertar_historial
    Created on : 23-feb-2022, 16:14:34
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
            <input type="hidden" name="instruccion" value="insertar_historial">
           Id evento :<input type="text" name="id">
           <br><br>
           Tipo :<input type="text" name="tipo">
           <br><br>
           Fecha y Hora:<input type="text" name="fechahora">
           <br><br>
            Empleado :<input type="text" name="empleado">
           <br><br>
           
           <input type="submit" name="enviar" value="Enviar">
            
        </form> 
    </body>
</html>
