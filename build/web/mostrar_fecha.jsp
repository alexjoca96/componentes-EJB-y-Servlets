<%-- 
    Document   : mostrar_fecha
    Created on : 23-feb-2022, 20:53:29
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
      <%  
         String fecha =(String) request.getAttribute("FECHA"); %>
    <body  >
       
        <h1>Ultimo inicio de sesion: <%= fecha %> </h1>
        <form action="NewServlet" method="POST">
            <input type="hidden" name="instruccion" value="volver">
           
           <input type="submit" name="volver" value="Volver a inicio">
            
        </form> 
    </body>
</html>

