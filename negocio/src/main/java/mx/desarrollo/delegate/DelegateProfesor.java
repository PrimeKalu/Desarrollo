/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;
import java.util.List;
import mx.desarrollo.entidad.Profesor;
import mx.desarrollo.integracion.ServiceLocator;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateProfesor {
    
    
    
    public void saveProfesores(Profesor profesores){
        ServiceLocator.getInstanceProfesorDAO().save(profesores);
    }
    
    public void updateProfesores(Profesor profesor) {
        ServiceLocator.getInstanceProfesorDAO().update(profesor);
    }

    public boolean deleteProfesores(Profesor profesor) {
        //Profesores profesores = new Profesores();
        List<Profesor> prof = ServiceLocator.getInstanceProfesorDAO().findAll();
        for(Profesor pro:prof){
            if(pro.getNombre().equalsIgnoreCase(profesor.getNombre())){
                //profesores = pro;
                ServiceLocator.getInstanceProfesorDAO().delete(pro);
                return true;
            }
        }
        return false;
    }

    public List<Profesor> findAllProfesores() {
        return ServiceLocator.getInstanceProfesorDAO().findAll();
    }

    public Profesor findProfesorById(Integer id) {
        return ServiceLocator.getInstanceProfesorDAO().find(id);
    }
    
    /*public Profesores findProfesorById(String nombre) {
        return ServiceLocator.getInstanceProfesoresDAO().find(nombre);
    }*/
    }

