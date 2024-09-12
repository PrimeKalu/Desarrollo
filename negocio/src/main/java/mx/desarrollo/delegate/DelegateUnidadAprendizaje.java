
package mx.desarrollo.delegate;

import java.util.List;
import mx.desarrollo.entidad.UnidadAprendizaje;
import mx.desarrollo.integracion.ServiceLocator;

/**
 * Delegate para la gestión de unidades de aprendizaje.
 */
public class DelegateUnidadAprendizaje {

    // Método para registrar una nueva unidad de aprendizaje
    public void saveUnidadAprendizaje(UnidadAprendizaje unidad) throws Exception {
        // Validación: verificar si el nombre de la unidad no está vacío
        if (unidad.getNombreUnidad() == null || unidad.getNombreUnidad().isEmpty()) {
            throw new Exception("El nombre de la unidad de aprendizaje no puede estar vacío.");
        }

        // Validación: verificar si las horas son válidas
        if (unidad.getHorasClase() < 0 || unidad.getHorasTaller() < 0 || unidad.getHorasLaboratorio() < 0) {
            throw new Exception("Las horas de clase, taller o laboratorio no pueden ser negativas.");
        }

        // Guardar la unidad de aprendizaje en la base de datos a través del DAO
        ServiceLocator.getInstanceUnidadAprendizajeDAO().save(unidad);
    }

    // Método para actualizar una unidad de aprendizaje
    public void updateUnidadAprendizaje(UnidadAprendizaje unidad) throws Exception {
        // Validar que la unidad de aprendizaje existe en la base de datos
        UnidadAprendizaje unidadExistente = ServiceLocator.getInstanceUnidadAprendizajeDAO().find(unidad.getIdUnidadAprendizaje());
        if (unidadExistente == null) {
            throw new Exception("La unidad de aprendizaje no existe.");
        }

        // Validaciones de negocio
        if (unidad.getNombreUnidad() == null || unidad.getNombreUnidad().isEmpty()) {
            throw new Exception("El nombre de la unidad de aprendizaje no puede estar vacío.");
        }

        // Actualizar la unidad de aprendizaje en la base de datos
        ServiceLocator.getInstanceUnidadAprendizajeDAO().update(unidad);
    }

    // Método para eliminar una unidad de aprendizaje por ID
    public boolean deleteUnidadAprendizajeById(Integer id) throws Exception {
        // Buscar la unidad de aprendizaje por ID
        UnidadAprendizaje unidad = ServiceLocator.getInstanceUnidadAprendizajeDAO().find(id);
        if (unidad != null) {
            // Eliminar la unidad de aprendizaje
            ServiceLocator.getInstanceUnidadAprendizajeDAO().delete(unidad);
            return true;
        }
        return false;
    }

    // Método para listar todas las unidades de aprendizaje
    public List<UnidadAprendizaje> findAllUnidadesAprendizaje() {
        return ServiceLocator.getInstanceUnidadAprendizajeDAO().findAll();
    }
}
    // Método para buscar una unidad de aprendizaje por ID
