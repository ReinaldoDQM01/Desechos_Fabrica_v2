/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Entities;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

/**
 *
 * @author Reinaldo Quintana
 */

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    private LocalDateTime fechaCreacion;

    private LocalDateTime FechaActualizacion;

    private int estado;    
    
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime FechaActualizacion) {
        this.FechaActualizacion = FechaActualizacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public BaseEntity(Long id, LocalDateTime fechaCreacion, LocalDateTime FechaActualizacion, int estado) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.FechaActualizacion = FechaActualizacion;
        this.estado = estado;
    }
}
