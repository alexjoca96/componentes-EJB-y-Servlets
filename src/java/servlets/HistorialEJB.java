/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ClaseTablas.Empleado;
import ClaseTablas.Historial;
import ClaseTablas.Incidencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
public class HistorialEJB {
    
@PersistenceUnit
EntityManagerFactory emf;
public List findAll(){
    
   return emf.createEntityManager().createNamedQuery("Historial.findAll").getResultList();
 //return emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario","alexjoca" ).getResultList();
}

public Empleado findByid(String usuario){
    return (Empleado) emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario", usuario ).getSingleResult();
}

public void isertHistorial(Historial h) {
   
    EntityManager em =  emf.createEntityManager();
    em.persist(h);
    em.close();
  
}
public  String Fecha_sesion(Empleado usuario) throws ParseException{
   SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
   List <Date> fechas = new ArrayList<>();
   EntityManager em =  emf.createEntityManager();
   Query query=em.createQuery("SELECT h FROM Historial h WHERE h.empleado = :usuario AND h.tipo= 'I'");
   query.setParameter("usuario", usuario.getNombreusuario());
   List<Historial> results =query.getResultList();
   Iterator historialiterator= results.iterator();
   while(historialiterator.hasNext()){
   Historial h2 = (Historial) historialiterator.next();
   Date fecha= formato.parse(h2.getFechahora());
   fechas.add(fecha);
  }
    Date aux= fechas.get(0);
       for (int j = 0; j < fechas.size(); j++) {
           if (fechas.get(j).after(aux)) {
           aux=fechas.get(j);
           } 
       }
      // System.out.println("Fecha y Hora del ultimo Incicio de sesión: "+aux);
  return aux.toString();
  
   }

 public  List Ranking() {
        //Empleado cambio= (Empleado) emf.createEntityManager().createNamedQuery("Empleado.findByNombreusuario").setParameter("nombreusuario",usu ).getSingleResult();
    EntityManager em =  emf.createEntityManager();
    Query query = em.createQuery("SELECT  h.empleado FROM Historial h WHERE h.tipo= 'U' GROUP BY h.empleado ORDER BY  count(h.empleado) DESC  ");
    //query.setParameter("destino", destino.getNombrecompleto());
     List<Empleado> result=(List<Empleado>) query.getResultList(); 
    return result;
   }
}
