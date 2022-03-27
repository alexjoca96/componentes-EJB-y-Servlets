<%-- 
    Document   : mostrar
    Created on : 21-feb-2022, 12:24:18
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
         NewServlet servlet= new NewServlet();
         List<Incidencia> incidencias =(List<Incidencia>) request.getAttribute("IDINCIDENCIA"); %>
    <body  >
       
             <table>
            <tr>
                <td class="cabecera"> Id </td>
                <td class="cabecera">Origen </td>
                <td class="cabecera">Destino</td>
                <td class="cabecera">Fecha y hora </td>
                <td class="cabecera">Detalle</td>
                <td class="cabecera">Tipo </td>
            </tr>
             <%  if(incidencias.size()>0){
                
                for (Incidencia temInci : incidencias){ %>
             <tr>
                <td class="filas"><%= temInci.getIdincidencia() %> </td>
                <td class="filas"><%= temInci.getOrigen().getNombrecompleto() %> </td>
                <td class="filas"><%= temInci.getDestino().getNombrecompleto() %> </td>
                <td class="filas"><%= temInci.getFechahora() %> </td>
                <td class="filas"><%= temInci.getDetalle() %> </td>
                <td class="filas"><%= temInci.getTipo() %> </td>
            </tr>
           <% }} %>
        </table> 
        <form action="NewServlet" method="POST">
            <input type="hidden" name="instruccion" value="volver">
           
           <input type="submit" name="volver" value="Volver a inicio">
            
        </form> 
    </body>
</html>
