/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;


import java.util.List;
import mx.desarrollo.delegate.DelegateUnidadAprendizaje;
import mx.desarrollo.entidad.UnidadAprendizaje;

/**
 *
 * @author gusba
 */
public class FacadeUnidadAprendizaje {
    
    private DelegateUnidadAprendizaje delegate;

    public FacadeUnidadAprendizaje(DelegateUnidadAprendizaje delegate) {
        this.delegate = delegate;
    }

   
    
     public void saveUnidadAprendizaje(UnidadAprendizaje unidad) {
        delegate.saveUnidadAprendizaje(unidad);
    }

    
    public void updateUnidadAprendizaje(UnidadAprendizaje unidad)  {
        delegate.updateUnidadAprendizaje(unidad);
    }
     
    public boolean deleteUnidadAprendizajeById(Integer id) throws Exception {
        return delegate.deleteUnidadAprendizajeById(id);
    }
    
    
     public List<UnidadAprendizaje> findAllUnidadesAprendizaje() {
        return delegate.findAllUnidadesAprendizaje();
    }
     
     
    
}
