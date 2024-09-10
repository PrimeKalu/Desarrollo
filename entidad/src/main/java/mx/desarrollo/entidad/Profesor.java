/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.entidad;


import java.io.Serializable;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "profesor")
public class Profesor implements Serializable {

    // Propiedades observables de JavaFX
    private LongProperty idProfesor;
    private StringProperty nombre;
    private StringProperty apellido;
    private StringProperty rfc;

    // Relación con asignaciones (Lazy para evitar cargar todo al instante)
    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Asignacion> asignaciones;

    // Constructor vacío
    public Profesor() {
        this.idProfesor = new SimpleLongProperty();
        this.nombre = new SimpleStringProperty();
        this.apellido = new SimpleStringProperty();
        this.rfc = new SimpleStringProperty();
    }

    // Constructor parametrizado
    public Profesor(String nombre, String apellido, String rfc) {
        this();
        this.nombre.set(nombre);
        this.apellido.set(apellido);
        this.rfc.set(rfc);
    }

    // Getters y Setters con propiedades observables de JavaFX
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProfesor")
    public Long getIdProfesor() {
        return idProfesor.get();
    }

    public void setIdProfesor(Long idProfesor) {
        this.idProfesor.set(idProfesor);
    }

    public LongProperty idProfesorProperty() {
        return idProfesor;
    }

    @Column(name = "nombre", nullable = false)
    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    @Column(name = "apellido", nullable = false)
    public String getApellido() {
        return apellido.get();
    }

    public void setApellido(String apellido) {
        this.apellido.set(apellido);
    }

    public StringProperty apellidoProperty() {
        return apellido;
    }

    @Column(name = "rfc", unique = true, nullable = false, length = 13)
    public String getRfc() {
        return rfc.get();
    }

    public void setRfc(String rfc) {
        this.rfc.set(rfc);
    }

    public StringProperty rfcProperty() {
        return rfc;
    }

    public Set<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(Set<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
}

