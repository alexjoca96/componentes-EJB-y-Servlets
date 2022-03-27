<%-- 
    Document   : insertar_incidencia
    Created on : 22-feb-2022, 19:12:39
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
            <input type="hidden" name="instruccion" value="insertar_incidencia">
           Id :<input type="text" name="id">
           <br><br>
           Origen:<input type="text" name="origen">
           <br><br>
           Destino :<input type="text" name="destino">
           <br><br>
           Fecha y Hora:<input type="text" name="fechahora">
           <br><br>
            Detalle :<input type="text" name="detalle">
           <br><br>
           Tipo :<input type="text" name="tipo">
           <br><br>
           <input type="submit" name="enviar" value="Enviar">
            
        </form> 
    </body>
</html>
