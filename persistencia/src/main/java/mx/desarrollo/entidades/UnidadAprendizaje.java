/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.entidades;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "unidad_aprendizaje")
public class UnidadAprendizaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUnidadAprendizaje;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int horasClase;

    @Column(nullable = false)
    private int horasTaller;

    @Column(nullable = false)
    private int horasLaboratorio;

    // Relación muchos a muchos con Profesor a través de Asignacion
    @OneToMany(mappedBy = "unidadAprendizaje", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Asignacion> asignaciones;

    // Getters y Setters

    public Long getIdUnidadAprendizaje() {
        return idUnidadAprendizaje;
    }

    public void setIdUnidadAprendizaje(Long idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public int getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(int horasTaller) {
        this.horasTaller = horasTaller;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    public Set<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(Set<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
    
}


