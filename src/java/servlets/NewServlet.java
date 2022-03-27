/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ClaseTablas.Empleado;
import ClaseTablas.Historial;
import ClaseTablas.Incidencia;
import ClaseTablas.modeloEmpleado;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexa
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
   boolean vista=false;
    @EJB
    EmpleadoEJB eEJB;
    @EJB
    IncidenciaEJB iEJB;
    @EJB
    HistorialEJB hEJB;
    
    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//
     * @throws javax.servlet.ServletException */
   // private modeloEmpleado modelo;
    //@Resource(name="jdbc/sample")
   // HttpServletRequest request;
   // HttpServletResponse response;
//   
//    /**
//     *
//     * @throws ServletException
////     */
    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        
    }
//    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
      mostrar(request,response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   // List<Empleado> l = eEJB.findAll();
    //request.setAttribute("LISTAEMPLEADOS", l);
//     RequestDispatcher miDispatcher= request.getRequestDispatcher("/mostrar.jsp");
//  miDispatcher.forward(request, response);
    
    String instruccion=request.getParameter("instruccion");
        
//    String vistas =request.getParameter("gestion");
//      if (vista){ 
//      switch(vistas){
//    
//        case "1":
//             mostrar(request,response);
//             break;
//       
//        case "2":
//              borrarEmpleado(request,response);
//              break;
//        case "3":
//              modificarEmpleado(request,response);
//              break;
//                      
//       
//        default:
//       
//        break;
//    }
//        
//      }
    switch(instruccion){
    
        case "insertar_empleado":
             insertarEmpleado(request,response);
             break;
       
        case "borrar_empleado":
              borrarEmpleado(request,response);
              break;
        case "modificar_empleado":
              modificarEmpleado(request,response);
              break;
                      
        case "validar_empleado":
              validararEmpleado(request,response);
              break;
        case "cambiar_contrasena":
             cambiarPassword(request,response);
              break;
        case "mostrar":
             mostrar(request,response);
              break;
              
        case "insertar_incidencia":
                insertarIncidencia(request,response);
                break;
        case "incidencia_id":
               mostrarIncidenciaId(request,response);
                break;
        case "incidenciaPorempleado":
                incidenciaOrigen(request,response);
                break;
        case "incidenciaParaempleado":
                incidenciaDestino(request,response);
                break;
        case "insertar_historial":
                insertarHistorial(request,response);
                break;
        case "ranking":
               ranking(request,response);
                break;
        case "posicion_ranking":
                posicionRanking(request,response);
                break;
        case "ultima_sesion":
    {
        try {
            ultimaSesion(request,response);
        } catch (ParseException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
                break;
        default:
            mostrar(request,response);
    }
      
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void insertarEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usu =request.getParameter("nombreUsuario");
        String nombre= request.getParameter("nombreCompleto");
        String clave=request.getParameter("Password");
        String telf= request.getParameter("Telefono");
        eEJB.isertEmpleado(new Empleado(usu,clave,nombre,telf));
        mostrar(request,response);
    }

    private void modificarEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String usu =request.getParameter("nombreUsuario");
       String nombre= request.getParameter("nombreCompleto");
       String clave=request.getParameter("Password");
       String telf= request.getParameter("Telefono");
       eEJB.modificar(usu,nombre,clave,telf);
       mostrar(request,response);
    }

    private void validararEmpleado(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String usu =request.getParameter("nombreUsuario");
        
        String clave=request.getParameter("Password");
        Empleado e=  eEJB.validar(usu);
        String validar="";
        if(e.getPassword().equals(clave)){
        validar=" El usuario y contraseña son correctos";
        
        }else{
        
        validar=" El usuario o contraseña son incorrectos";
        }
        request.setAttribute("VALIDAR", validar);
        RequestDispatcher miDispatcher= request.getRequestDispatcher("/validar.jsp");
        miDispatcher.forward(request, response);
        
        
    }

    private void cambiarPassword(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String usu =request.getParameter("nombreUsuario");
        
        String clave=request.getParameter("Password");
        eEJB.cambiarPassword(usu,clave);
        mostrar(request,response);
    }

    private void borrarEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usu =request.getParameter("nombreUsuario");
        boolean validar = eEJB.Delete(usu);
       //mostrar(request,response);
        request.setAttribute("VALIDAR", validar);
        RequestDispatcher miDispatcher= request.getRequestDispatcher("/borrado_exito.jsp");
        miDispatcher.forward(request, response);
        
    }

    public  void mostrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     List<Empleado> empleados= eEJB.findAll();
     List<Incidencia> incidencias =iEJB.findAll();
     List<Incidencia> historial= hEJB.findAll();
     try{
        
        request.setAttribute("LISTAEMPLEADOS", empleados);
        request.setAttribute("LISTAINCIDENCIAS", incidencias);
        request.setAttribute("LISTAHISTORIAL", historial);
        RequestDispatcher miDispatcher= request.getRequestDispatcher("/index.jsp");
        miDispatcher.forward(request, response);
        
         // processRequest(request, response);
      }catch(Exception e){
      
      }
    }
     private void insertarIncidencia(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id =request.getParameter("id");
        int idincidencia= Integer.parseInt(id);
        String origen= request.getParameter("origen");
        String destino=request.getParameter("destino");
        String fecha= request.getParameter("fechahora");
        String detalle=request.getParameter("detalle");
        String tipo= request.getParameter("tipo");
        Empleado orig= eEJB.findByid(origen);
        Empleado dest= eEJB.findByid(destino);
        Incidencia tem= new Incidencia( idincidencia, fecha,detalle,tipo); 
        tem.setOrigen(orig);
        tem.setDestino(dest);
        iEJB.isertIncidencia(tem);
        mostrar(request,response);
    }
  public  void mostrarIncidenciaId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String id =request.getParameter("id");
      int idincidencia= Integer.parseInt(id);
      
     List<Incidencia> incidencia =(List<Incidencia>) iEJB.findbyId(idincidencia);
      try{
        
       
        request.setAttribute("IDINCIDENCIA", incidencia);
        RequestDispatcher miDispatcher= request.getRequestDispatcher("/mostrar.jsp");
        miDispatcher.forward(request, response);
        
         // processRequest(request, response);
      }catch(Exception e){
      
      }
    }
  private void incidenciaDestino(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usu =request.getParameter("nombreUsuario");
        Empleado temp=  eEJB.findByid(usu);
        List<Incidencia> incidencia=iEJB.porDestino(temp,usu);
        try{
        
       
        request.setAttribute("IDINCIDENCIA", incidencia);
        RequestDispatcher miDispatcher= request.getRequestDispatcher("/mostrar.jsp");
        miDispatcher.forward(request, response);
        
         // processRequest(request, response);
      }catch(Exception e){
      
      }
        
    }

    private void incidenciaOrigen(HttpServletRequest request, HttpServletResponse response) {
       String usu =request.getParameter("nombreUsuario");
        Empleado temp=  eEJB.findByid(usu);
        List<Incidencia> incidencia=iEJB.porOrigen(temp,usu);
        try{
        
       
        request.setAttribute("IDINCIDENCIA", incidencia);
        RequestDispatcher miDispatcher= request.getRequestDispatcher("/mostrar.jsp");
        miDispatcher.forward(request, response);
        
         // processRequest(request, response);
      }catch(Exception e){
      
      }
    }
    
     private void insertarHistorial(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id =request.getParameter("id");
        int idincidencia= Integer.parseInt(id);
        String tipo= request.getParameter("tipo");
        String fecha= request.getParameter("fechahora");
        String empleado=request.getParameter("empleado");
        
        Empleado emp= eEJB.findByid(empleado);
        
        Historial tem= new Historial( idincidencia,tipo ,fecha); 
        tem.setEmpleado(emp);
        
        hEJB.isertHistorial(tem);
        mostrar(request,response);
    }

    private void ranking(HttpServletRequest request, HttpServletResponse response) {
       List<Empleado> historial= hEJB.Ranking();
    try{
        
       
        request.setAttribute("MOSTRARHISTORIAL", historial);
        RequestDispatcher miDispatcher= request.getRequestDispatcher("/ranking.jsp");
        miDispatcher.forward(request, response);
        
         // processRequest(request, response);
      }catch(Exception e){
      
      }
    }

    private void posicionRanking(HttpServletRequest request, HttpServletResponse response) {
        String empleado=request.getParameter("empleado");
        List<Empleado> rank= hEJB.Ranking();

          try{
        
       
       request.setAttribute("MOSTRARPOSICION", rank);
       request.setAttribute("EMPLEADO", empleado);
        RequestDispatcher miDispatcher= request.getRequestDispatcher("/mostrar_posicion.jsp");
        miDispatcher.forward(request, response);
        
         // processRequest(request, response);
      }catch(Exception e){
      
      }
    }

    private void ultimaSesion(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        String empleado=request.getParameter("empleado");
        Empleado tem = eEJB.findByid(empleado);
        String fecha = hEJB.Fecha_sesion(tem);
      try{
        
       
       request.setAttribute("FECHA", fecha);
       RequestDispatcher miDispatcher= request.getRequestDispatcher("/mostrar_fecha.jsp");
       miDispatcher.forward(request, response);
        
         // processRequest(request, response);
      }catch(Exception e){
      
      }

    }
     
}
