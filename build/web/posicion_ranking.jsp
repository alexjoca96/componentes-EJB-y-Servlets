<%-- 
    Document   : posicion_ranking
    Created on : 23-feb-2022, 19:53:57
    Author     : alexa
--%>


<%@page  language="java" contentType="text/html; charset= ISO-8859-1 " pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<%@ page import="java.util.*, ClaseTablas.*" %> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    
    </head>
     
    <body  >
       
         <form action="NewServlet" method="POST">
            <input type="hidden" name="instruccion" value="posicion_ranking">
          
           Nombre del Empleado :<input type="text" name="empleado">
      
           <input type="submit" name="enviar" value="Enviar">
            
        </form> 
    </body>
</html>
