/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ClaseTablas.Empleado;
import ClaseTablas.Incidencia;
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
public class IncidenciaEJB {
     Incidencia i;
@PersistenceUnit
EntityManagerFactory emf;
public List findAll(){
    
   return emf.createEntityManager().createNamedQuery("Incidencia.findAll").getResultList();
 //return emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario","alexjoca" ).getResultList();
}
public List findbyId(int id ){
    
   //return emf.createEntityManager().createNamedQuery("Incidencia.findAll").getResultList();
 return  emf.createEntityManager().createNamedQuery("Incidencia.findByIdincidencia").setParameter("idincidencia",id ).getResultList();
}
public void isertIncidencia(Incidencia i) {
    
 
    EntityManager em =  emf.createEntityManager();
    em.persist(i);
    em.close();
  
}



   public  List porDestino(Empleado e, String destino) {
        //Empleado cambio= (Empleado) emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario",usu ).getSingleResult();
    EntityManager em =  emf.createEntityManager();
    Query query = em.createQuery("Select i FROM Incidencia i WHERE i.destino.nombreusuario= :destino");
    query.setParameter("destino", destino);
     List<Incidencia> result=(List<Incidencia>) query.getResultList(); 
    return result;
   }
    public  List porOrigen(Empleado e, String origen) {
        //Empleado cambio= (Empleado) emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario",usu ).getSingleResult();
    EntityManager em =  emf.createEntityManager();
    Query query = em.createQuery("Select i FROM Incidencia i WHERE i.origen.nombreusuario = :origen");
    query.setParameter("origen", origen);
     List<Incidencia> result=(List<Incidencia>) query.getResultList(); 
    return result;
   }
}
