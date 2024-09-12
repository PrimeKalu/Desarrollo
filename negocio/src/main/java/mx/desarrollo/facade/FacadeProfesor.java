
package mx.desarrollo.facade;


import java.util.List;
import mx.desarrollo.delegate.DelegateProfesor;
import mx.desarrollo.entidad.Profesor;

/**
 * Fachada para la gestión de Profesores
 */
public class FacadeProfesor {

    // Instancia del DelegateProfesor que gestionará las operaciones de negocio
    private DelegateProfesor delegateProfesor;

    // Constructor
    public FacadeProfesor() {
        this.delegateProfesor = new DelegateProfesor();
    }

    /**
     * Guarda un profesor en la base de datos
     * @param profesor El objeto profesor a guardar
     */
    public void saveProfesor(Profesor profesor) {
        delegateProfesor.saveProfesores(profesor);
    }

    /**
     * Actualiza los datos de un profesor
     * @param profesor El objeto profesor a actualizar
     */
    public void updateProfesor(Profesor profesor) {
        delegateProfesor.updateProfesores(profesor);
    }

    /**
     * Elimina un profesor de la base de datos
     * @param profesor El objeto profesor a eliminar
     * @return boolean Indica si se eliminó correctamente
     */
    public boolean deleteProfesor(Profesor profesor) {
        return delegateProfesor.deleteProfesores(profesor);
    }

    /**
     * Busca y devuelve una lista de todos los profesores
     * @return List<Profesor> Lista de profesores
     */
    public List<Profesor> findAllProfesores() {
        return delegateProfesor.findAllProfesores();
    }

    /**
     * Busca un profesor por su ID
     * @param id El ID del profesor
     * @return Profesor El profesor encontrado o null si no existe
     */
    public Profesor findProfesorById(Integer id) {
        return delegateProfesor.findProfesorById(id);
    }

}

