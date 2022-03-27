/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ClaseTablas.Empleado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

/**
 *
 * @author alexa
 */
@Stateless
public class EmpleadoEJB {
    Empleado e;
@PersistenceUnit
EntityManagerFactory emf;
public List findAll(){
    
   return emf.createEntityManager().createNamedQuery("Empleado.findAll").getResultList();
 //return emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario","alexjoca" ).getResultList();
}

public Empleado findByid(String usuario){
    return (Empleado) emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario", usuario ).getSingleResult();
}

public void isertEmpleado(Empleado e) {
    
   // = pedirDatos();
    EntityManager em =  emf.createEntityManager();
    em.persist(e);
    em.close();
  // findAll();
}
public boolean Delete(String usuario){

    EntityManager em =  emf.createEntityManager();
    Query query = em.createQuery("DELETE  FROM Empleado e WHERE e.nombreusuario= :nombreusuario");
    query.setParameter("nombreusuario", usuario);
     query.executeUpdate();
  return true;
}
public Empleado validar(String usuario){
    Empleado validar= (Empleado) emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario",usuario ).getSingleResult();
    //EntityManager em =  emf.createEntityManager();
   return validar; 
}
public void cambiarPassword(String usuario, String clave){
    Empleado cambio= (Empleado) emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario",usuario ).getSingleResult();
    //EntityManager em =  emf.createEntityManager();
   cambio.setPassword(clave);
}

   public  void modificar(String usu, String nombre, String clave, String telf) {
        Empleado cambio= (Empleado) emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario",usu ).getSingleResult();
    cambio.setNombrecompleto(nombre);
    cambio.setPassword(clave);
    cambio.setTelefono(telf);
   }
}
