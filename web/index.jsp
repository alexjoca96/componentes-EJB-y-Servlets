++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++<%-- 
    Document   : index
    Created on : 15-feb-2022, 23:58:17
    Author     : alexa
--%>

<%@page  language="java" contentType="text/html; charset= ISO-8859-1 " pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<%@ page import="java.util.*, ClaseTablas.*" %> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            .cabecera{
                font-size: 1.2em;
                font-weight: bold;
                boder-bottom: solid #F00 1px;
                } 
                .filas{
                  text-align: center;  
                 }
                 table{
                   float: left;
                   }
                   #contenedorBoton{
                       magin-left:1000px;
                       
                   } 
            
        </style>
    
    </head>
      <%  
         List<Empleado> empleados = (List<Empleado>) request.getAttribute("LISTAEMPLEADOS"); 
         List<Incidencia> incidencias = (List<Incidencia>) request.getAttribute("LISTAINCIDENCIAS");
         List<Historial> historial = (List<Historial>) request.getAttribute("LISTAHISTORIAL");
%>
    <body  >
       
               <table>
            <tr>
                <td class="cabecera">Nombre Usuario </td>
                <td class="cabecera">Nombre Completo </td>
                <td class="cabecera">Password </td>
                <td class="cabecera">Telefono </td>
            </tr>
            <%  if(empleados.size()>0){
                
                for (Empleado temEmp : empleados){ %>
             <tr>
                 <td class="filas"><%=temEmp.getNombreusuario() %> </td>
                <td class="filas"><%=temEmp.getNombrecompleto() %> </td>
                <td class="filas"><%=temEmp.getPassword() %> </td>
                <td class="filas"><%=temEmp.getTelefono() %> </td>
            </tr>
            <% }} %>
        </table>    
        <div id="contenedorBoton">
         <input type="button"  value="Insertar Empleado" onclick="window.location.href='insertar_empleado.jsp'"/>
             <br><br>
           <input type="button" value="Modificar Empleado"onclick="window.location.href='modificar_empleado.jsp'"/>
           <br><br>
          <input type="button" value="Borrar Empleado"onclick="window.location.href='borrar_empleado.jsp'"/>
           <br><br>
          <input type="button" value="Validar Empleado"onclick="window.location.href='validar_empleado.jsp'"/>
           <br><br>
           <input type="button" value="Cambiar Contraseña" onclick="window.location.href='cambiar_contrasena.jsp'"/>

        </div>
       <br><br><br><br><br><br><br><br>
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
        <div id="contenedorBoton">
         <input type="button"  value="Mostrar incidencia mediante Id" onclick="window.location.href='incidencia_id.jsp'"/>
             <br><br>
           <input type="button" value="Insertar Incidencia"onclick="window.location.href='insertar_incidencia.jsp'"/>
           <br><br>
          <input type="button" value="Obtener las incidencias destinadas a un  empleado"onclick="window.location.href='incidenciaParaempleado.jsp'"/>
           <br><br>
          <input type="button" value="Obtener las incidencias originadas por un empleado"onclick="window.location.href='incidenciaPorempleado.jsp'"/>
           <br><br>
           
        </div>
        
          <table>
            <tr>
                <td class="cabecera">Id evento </td>
                <td class="cabecera">Tipo </td>
                <td class="cabecera">Fecha y Hora </td>
                <td class="cabecera">Empleado </td>
            </tr>
            <%  if(historial.size()>0){
                
                for (Historial temH : historial){ %>
             <tr>
                 <td class="filas"><%=temH.getIdevento() %> </td>
                <td class="filas"><%=temH.getTipo() %> </td>
                <td class="filas"><%=temH.getFechahora() %> </td>
                <td class="filas"><%=temH.getEmpleado().getNombrecompleto() %> </td>
            </tr>
            <% }} %>
        </table>    
        <div id="contenedorBoton">
         
           
            <input type="button"  value="Insertar historial" onclick="window.location.href='insertar_historial.jsp'"/>
             <br><br>
           
             <input type="button" value="fecha ultima de inicio de sesión "onclick="window.location.href='ultima.jsp'"/>
           <br><br>
           <input type="button" value="Posicion del empleado en el ranking"onclick="window.location.href='posicion_ranking.jsp'"/>
           <br><br>
        <form action="NewServlet" method="POST"> 
           <input type="hidden" name="instruccion" value="ranking">
           <input type="submit" name="ranking" value="ranking de los empleados por cantidad de incidencias urgentes">
        </form> 

        </div>
    </body>
</html>
