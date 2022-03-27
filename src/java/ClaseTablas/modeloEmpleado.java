/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseTablas;

import java.sql.*;
import java.util.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.sql.DataSource;

/**
 *
 * @author alexa
 */
public class modeloEmpleado {
   
@PersistenceUnit
EntityManagerFactory emf;
    public modeloEmpleado() {
        
    }
    public List<Empleado> geEempleado()throws Exception{
         List<Empleado> empleados = new ArrayList<>();
        Connection miconexion= null;
        Statement miStatement= null;
        ResultSet miResultset= null;
        // Establecer la conexion ----------
       // miconexion= origenDatos.getConnection();
        
        //-----Crear la sentencia sql----------
        String instruccionSql="SELECT * FROM EMPLEADO";
       // miStatement= miconexion.createStatement();
        //- ----ejecutar SQL------------
        empleados=emf.createEntityManager().createQuery(instruccionSql).getResultList();
        
        //-recorrer el resulset obtenido----
        
//        while(miResultset.next()){
//        String usu = miResultset.getString("nombreusuario");
//        String nombre= miResultset.getString("nombrecompleto");
//        String clave=miResultset.getString("password");
//        String telf= miResultset.getString("telefono");
//        
//        Empleado temp= new Empleado(usu,clave,nombre,telf);
//        empleados.add(temp);
//        }
        return empleados;
    
    
    }
}
