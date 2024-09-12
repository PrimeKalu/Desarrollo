

package mx.desarrollo.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "asignacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignacion.findAll", query = "SELECT a FROM Asignacion a")
    , @NamedQuery(name = "Asignacion.findByIdAsignacion", query = "SELECT a FROM Asignacion a WHERE a.idAsignacion = :idAsignacion")
    , @NamedQuery(name = "Asignacion.findByFechaAsignacion", query = "SELECT a FROM Asignacion a WHERE a.fechaAsignacion = :fechaAsignacion")})
public class Asignacion implements Serializable {

    private static final long serialVersionUID = 1L;
    private Profesor profesor;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAsignacion")
    private Integer idAsignacion;
    @Basic(optional = false)
    @Column(name = "fechaAsignacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAsignacion;
    @JoinColumn(name = "idProfesor", referencedColumnName = "idProfesor")
    @ManyToOne(optional = false)
    private Profesor idProfesor;
    @JoinColumn(name = "idUnidadAprendizaje", referencedColumnName = "idUnidadAprendizaje")
    @ManyToOne(optional = false)
    private UnidadAprendizaje idUnidadAprendizaje;

    public Asignacion() {
    }

    public Asignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Asignacion(Integer idAsignacion, Date fechaAsignacion) {
        this.idAsignacion = idAsignacion;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Integer getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Profesor getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Profesor idProfesor) {
        this.idProfesor = idProfesor;
    }

    public UnidadAprendizaje getIdUnidadAprendizaje() {
        return idUnidadAprendizaje;
    }

    public void setIdUnidadAprendizaje(UnidadAprendizaje idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsignacion != null ? idAsignacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignacion)) {
            return false;
        }
        Asignacion other = (Asignacion) object;
        if ((this.idAsignacion == null && other.idAsignacion != null) || (this.idAsignacion != null && !this.idAsignacion.equals(other.idAsignacion))) {
            return false;
        }
        return true;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return "mx.desarrollo.entidad.Asignacion[ idAsignacion=" + idAsignacion + " ]";
    }
    
}
