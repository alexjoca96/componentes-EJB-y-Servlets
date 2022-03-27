<%-- 
    Document   : mostrar_posicion
    Created on : 23-feb-2022, 20:00:16
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
         List <Empleado> rank =(List <Empleado>) request.getAttribute("MOSTRARPOSICION"); 
         String empleado= (String) request.getAttribute("EMPLEADO");
         Empleado ranki=null;
         int pos=0,aux=0;
      %>
    <body  >
       
             <table>
            <tr>
                <td class="cabecera"> Usuario </td>
                <td class="cabecera">Empleado </td>
                 <td class="cabecera">Posicion en Ranking </td>
                
            </tr>
             
            <% 
            for (int j = 0; j< rank.size(); j++) {
                 pos++;
                if (rank.get(j).getNombreusuario().equals(empleado)) {
                
                ranki= rank.get(j);
                aux=pos;
               }
            }
            %>
                
             <tr>
                <td class="filas"><%= ranki.getNombreusuario() %> </td>
                <td class="filas"><%= ranki.getNombrecompleto() %> </td>
                <td class="filas"><%= aux %> </td>
        
            </tr>
           
        </table>   
        <form action="NewServlet" method="POST">
            <input type="hidden" name="instruccion" value="volver">
           
           <input type="submit" name="volver" value="Volver a inicio">
            
        </form> 
    </body>
</html>
