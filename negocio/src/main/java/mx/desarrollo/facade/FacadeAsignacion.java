/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;

import java.util.List;
import mx.desarrollo.delegate.DelegateAsignacion;
import mx.desarrollo.entidad.Asignacion;

/**
 *
 * @author gusba
 */
public class FacadeAsignacion {
    
    private DelegateAsignacion delegateAsignacion;

    public FacadeAsignacion(DelegateAsignacion delegateAsignacion) {
        this.delegateAsignacion = delegateAsignacion;
    }
    
     public void saveAsignacion(Asignacion asignacion) {
        delegateAsignacion.saveAsignacion(asignacion);
    }
     
     public void updateAsignacion(Asignacion asignacion) {
        delegateAsignacion.updateAsignacion(asignacion);
    }
     
      public List<Asignacion> findAllAsignacion() {
        return delegateAsignacion.findAllAsignacion();
    }
      
      public boolean deleteAsignacion(Asignacion asignacion) {
        return delegateAsignacion.deleteAsignacion(asignacion);
    }
    
}
