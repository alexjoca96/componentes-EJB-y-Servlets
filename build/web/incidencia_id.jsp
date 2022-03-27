<%-- 
    Document   : incidencia_id
    Created on : 22-feb-2022, 19:11:22
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
            <input type="hidden" name="instruccion" value="incidencia_id">
           Id :<input type="text" name="id">
           
           <input type="submit" name="enviar" value="Enviar">
            
        </form> 
    </body>
</html>
