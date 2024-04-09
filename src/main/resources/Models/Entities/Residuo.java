/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Entities;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Reinaldo Quintana
 */
@Entity
@Table(name = "residuos")
public class Residuo extends BaseEntity{
    
    private String codigo;
    
    @Column(name = "composicion_quimica")
    private String composicionQuimica;
    
    private int cantidad;
    
    @Column(name = "fecha_generacion")
    private LocalDateTime fechaGeneracion;
    
    @ManyToOne
    @JoinColumn(name = "productor_id")
    private Productor productor;
    
    @ManyToOne
    @JoinColumn(name = "envase_id")
    private Envase envase;
    
    @ManyToOne
    @JoinColumn(name = "traslado_id")
    private Traslado traslado;
    
    @OneToOne(mappedBy = "residuo", targetEntity = Tratamiento.class)
    private Tratamiento tratamiento;

    public Residuo(String codigo, String composicionQuimica, int cantidad, LocalDateTime fechaGeneracion, Productor productor, Envase envase, Traslado traslado, Tratamiento tratamiento, Long id, LocalDateTime fechaCreacion, LocalDateTime FechaActualizacion, int estado) {
        super(id, fechaCreacion, FechaActualizacion, estado);
        this.codigo = codigo;
        this.composicionQuimica = composicionQuimica;
        this.cantidad = cantidad;
        this.fechaGeneracion = fechaGeneracion;
        this.productor = productor;
        this.envase = envase;
        this.traslado = traslado;
        this.tratamiento = tratamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getComposicionQuimica() {
        return composicionQuimica;
    }

    public void setComposicionQuimica(String composicionQuimica) {
        this.composicionQuimica = composicionQuimica;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    public Traslado getTraslado() {
        return traslado;
    }

    public void setTraslado(Traslado traslado) {
        this.traslado = traslado;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    
}
