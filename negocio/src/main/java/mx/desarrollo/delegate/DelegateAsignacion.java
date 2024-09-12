/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;

import mx.desarrollo.entidad.Asignacion;
import java.util.List;
import mx.desarrollo.integracion.ServiceLocator;

public class DelegateAsignacion {

     public void saveAsignacion(Asignacion asignacion){
        ServiceLocator.getInstanceAsignacionDAO().save(asignacion);
    }
    
    public void updateAsignacion(Asignacion Asignacion) {
        ServiceLocator.getInstanceAsignacionDAO().update(Asignacion);
    }
    
    public List<Asignacion> findAllAsignacion() {
        return ServiceLocator.getInstanceAsignacionDAO().findAll();
    }
    
    public boolean deleteAsignacion(Asignacion Asignacion) {
        //Profesores profesores = new Profesores();
        List<Asignacion> asig = ServiceLocator.getInstanceAsignacionDAO().findAll();
        for(Asignacion asi:asig){
            if(asi.getIdAsignacion().equals(asi.getIdAsignacion())){
                //profesores = pro;
                ServiceLocator.getInstanceAsignacionDAO().delete(asi);
                return true;
            }
        }
        return false;
    }
}  

