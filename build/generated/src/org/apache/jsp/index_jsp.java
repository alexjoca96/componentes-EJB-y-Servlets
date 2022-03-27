package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import ClaseTablas.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset= ISO-8859-1 ");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .cabecera{\n");
      out.write("                font-size: 1.2em;\n");
      out.write("                font-weight: bold;\n");
      out.write("                boder-bottom: solid #F00 1px;\n");
      out.write("                } \n");
      out.write("                .filas{\n");
      out.write("                  text-align: center;  \n");
      out.write("                 }\n");
      out.write("                 table{\n");
      out.write("                   float: left;\n");
      out.write("                   }\n");
      out.write("                   #contenedorBoton{\n");
      out.write("                       magin-left:1000px;\n");
      out.write("                   } \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("      ");
  
         List<Empleado> empleados = (List<Empleado>) request.getAttribute("LISTAEMPLEADOS"); 
       List<Incidencia> incidencias = (List<Incidencia>) request.getAttribute("LISTAINCIDENCIAS");
      
      out.write("\n");
      out.write("    <body  >\n");
      out.write("       \n");
      out.write("               <table>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"cabecera\">Nombre Usuario </td>\n");
      out.write("                <td class=\"cabecera\">Nombre Completo </td>\n");
      out.write("                <td class=\"cabecera\">Password </td>\n");
      out.write("                <td class=\"cabecera\">Telefono </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
  if(empleados.size()>0){
                
                for (Empleado temEmp : empleados){ 
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                 <td class=\"filas\">");
      out.print(temEmp.getNombreusuario() );
      out.write(" </td>\n");
      out.write("                <td class=\"filas\">");
      out.print(temEmp.getNombrecompleto() );
      out.write(" </td>\n");
      out.write("                <td class=\"filas\">");
      out.print(temEmp.getPassword() );
      out.write(" </td>\n");
      out.write("                <td class=\"filas\">");
      out.print(temEmp.getTelefono() );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }} 
      out.write("\n");
      out.write("        </table>    \n");
      out.write("        <div id=\"contenedorBoton\">\n");
      out.write("         <input type=\"button\"  value=\"Insertar Empleado\" onclick=\"window.location.href='insertar_empleado.jsp'\"/>\n");
      out.write("             <br><br>\n");
      out.write("           <input type=\"button\" value=\"Modificar Empleado\"onclick=\"window.location.href='modificar_empleado.jsp'\"/>\n");
      out.write("           <br><br>\n");
      out.write("          <input type=\"button\" value=\"Borrar Empleado\"onclick=\"window.location.href='borrar_empleado.jsp'\"/>\n");
      out.write("           <br><br>\n");
      out.write("          <input type=\"button\" value=\"Validar Empleado\"onclick=\"window.location.href='validar_empleado.jsp'\"/>\n");
      out.write("           <br><br>\n");
      out.write("           <input type=\"button\" value=\"Cambiar Contraseña\" onclick=\"window.location.href='cambiar_contrasena.jsp'\"/>\n");
      out.write("  <!--          <br><br>\n");
      out.write("            <input type=\"button\" value=\"Mostrar\"/> onclick=\"window.location.href='mostrar.jsp'\"/> --> \n");
      out.write("        </div>\n");
      out.write("        <br><br><br><br><br><br><br><br>\n");
      out.write("         <table>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"cabecera\"> Id </td>\n");
      out.write("                <td class=\"cabecera\">Origen </td>\n");
      out.write("                <td class=\"cabecera\">Destino</td>\n");
      out.write("                <td class=\"cabecera\">Fecha y hora </td>\n");
      out.write("                <td class=\"cabecera\">Detalle</td>\n");
      out.write("                <td class=\"cabecera\">Tipo </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
  if(incidencias.size()>0){
                
                for (Incidencia temInci : incidencias){ 
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                <td class=\"filas\">");
      out.print(temInci.getIdincidencia() );
      out.write(" </td>\n");
      out.write("                <td class=\"filas\">");
      out.print(temInci.getOrigen().getNombrecompleto() );
      out.write(" </td>\n");
      out.write("                <td class=\"filas\">");
      out.print(temInci.getDestino().getNombrecompleto() );
      out.write(" </td>\n");
      out.write("                <td class=\"filas\">");
      out.print(temInci.getFechahora() );
      out.write(" </td>\n");
      out.write("                <td class=\"filas\">");
      out.print(temInci.getDetalle() );
      out.write(" </td>\n");
      out.write("                <td class=\"filas\">");
      out.print(temInci.getTipo() );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }} 
      out.write("\n");
      out.write("        </table>    \n");
      out.write("        <div id=\"contenedorBoton\">\n");
      out.write("         <input type=\"button\"  value=\"Mostrar incidencia mediante Id\" onclick=\"window.location.href='insertar_empleado.jsp'\"/>\n");
      out.write("             <br><br>\n");
      out.write("           <input type=\"button\" value=\"Insertar Incidencia\"onclick=\"window.location.href='modificar_empleado.jsp'\"/>\n");
      out.write("           <br><br>\n");
      out.write("          <input type=\"button\" value=\"Obtener las incidencias para un empleado\"onclick=\"window.location.href='borrar_empleado.jsp'\"/>\n");
      out.write("           <br><br>\n");
      out.write("          <input type=\"button\" value=\"Obtener las incidencias creadas por un empleado\"onclick=\"window.location.href='validar_empleado.jsp'\"/>\n");
      out.write("           <br><br>\n");
      out.write("           \n");
      out.write("  <!--          <br><br>\n");
      out.write("            <input type=\"button\" value=\"Mostrar\"/> onclick=\"window.location.href='mostrar.jsp'\"/> --> \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
