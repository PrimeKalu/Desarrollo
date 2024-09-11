/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.DAO;

import mx.desarrollo.entidades.Profesor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProfesorDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadDePersistencia");

    public void crearProfesor(Profesor profesor) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(profesor);
        em.getTransaction().commit();
        em.close();
    }

    public Profesor buscarProfesor(Long id) {
        EntityManager em = emf.createEntityManager();
        Profesor profesor = em.find(Profesor.class, id);
        em.close();
        return profesor;
    }

    public List<Profesor> listarProfesores() {
        EntityManager em = emf.createEntityManager();
        List<Profesor> profesores = em.createQuery("SELECT p FROM Profesor p", Profesor.class).getResultList();
        em.close();
        return profesores;
    }

    // Implementar métodos para eliminar y modificar
}
