package com.example.Proyecto.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name="Usuario")
public class Usuario extends Base{

    @Column(unique = true, nullable = false)
    private String nombre;
    private String email;
    private Integer prioridad;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}
