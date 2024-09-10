
package mx.desarrollo.entidad;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "asignacion")
public class Asignacion {

    private LongProperty idAsignacion;
    private ObjectProperty<Profesor> profesor;
    private ObjectProperty<UnidadAprendizaje> unidadAprendizaje;
    private ObjectProperty<Date> fechaAsignacion;

    public Asignacion() {
        this.idAsignacion = new SimpleLongProperty();
        this.profesor = new SimpleObjectProperty<>();
        this.unidadAprendizaje = new SimpleObjectProperty<>();
        this.fechaAsignacion = new SimpleObjectProperty<>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAsignacion")
    public Long getIdAsignacion() {
        return idAsignacion.get();
    }

    public void setIdAsignacion(Long idAsignacion) {
        this.idAsignacion.set(idAsignacion);
    }

    public LongProperty idAsignacionProperty() {
        return idAsignacion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProfesor", nullable = false)
    public Profesor getProfesor() {
        return profesor.get();
    }

    public void setProfesor(Profesor profesor) {
        this.profesor.set(profesor);
    }

    public ObjectProperty<Profesor> profesorProperty() {
        return profesor;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUnidadAprendizaje", nullable = false)
    public UnidadAprendizaje getUnidadAprendizaje() {
        return unidadAprendizaje.get();
    }

    public void setUnidadAprendizaje(UnidadAprendizaje unidadAprendizaje) {
        this.unidadAprendizaje.set(unidadAprendizaje);
    }

    public ObjectProperty<UnidadAprendizaje> unidadAprendizajeProperty() {
        return unidadAprendizaje;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaAsignacion", nullable = false)
    public Date getFechaAsignacion() {
        return fechaAsignacion.get();
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion.set(fechaAsignacion);
    }

    public ObjectProperty<Date> fechaAsignacionProperty() {
        return fechaAsignacion;
    }
}
