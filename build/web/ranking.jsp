<%-- 
    Document   : ranking
    Created on : 23-feb-2022, 17:55:39
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
         List<Empleado> historial =(List<Empleado>) request.getAttribute("MOSTRARHISTORIAL"); %>
    <body  >
       
             <table>
            <tr>
                <td class="cabecera"> Usuario </td>
                <td class="cabecera">Empleado </td>
                
                
            </tr>
             <%  if(historial.size()>0){
                
                for (Empleado tem : historial){ %>
             <tr>
                <td class="filas"><%= tem.getNombreusuario() %> </td>
                <td class="filas"><%= tem.getNombrecompleto() %> </td>
                
        
            </tr>
           <% }} %>
        </table>   
        <form action="NewServlet" method="POST">
            <input type="hidden" name="instruccion" value="volver">
           
           <input type="submit" name="volver" value="Volver a inicio">
            
        </form> 
    </body>
</html>

