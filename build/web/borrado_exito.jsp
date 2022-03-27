<%-- 
    Document   : borrado_exito
    Created on : 01-mar-2022, 12:56:01
    Author     : alexa
--%>


<%@page  language="java" contentType="text/html; charset= ISO-8859-1 " pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<%@ page import="java.util.*, ClaseTablas.* ,servlets.*" %> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    
    </head>
      <%  
        
        boolean validar =(boolean) request.getAttribute("VALIDAR"); %>
    <body  >
       
        <h1> Borrado exitoso </h1>
        <form action="NewServlet" method="POST">
            <input type="hidden" name="instruccion" value="volver">
           
           <input type="submit" name="volver" value="Volver a inicio">
            
        </form> 
    </body>
</html>
