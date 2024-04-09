package Models.Entities;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tratamientos")
public class Tratamiento extends BaseEntity{
    
    private String descripcion;
    
    @Column(name = "fecha_inicio")
    private LocalDateTime fechaInicio;
    
    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;
    
    @Column(name = "nombre_destio_final")
    private String nombreDestinoFinal;
    
    @Column(name = "direccion_destino_final")
    private String direccionDestinoFinal;

    @OneToOne 
    @JoinColumn(name = "residuo_id")
    private Residuo residuo;

    public Tratamiento(String descripcion, LocalDateTime fechaInicio, LocalDateTime fechaFin, String nombreDestinoFinal, String direccionDestinoFinal, Residuo residuo, Long id, LocalDateTime fechaCreacion, LocalDateTime FechaActualizacion, int estado) {
        super(id, fechaCreacion, FechaActualizacion, estado);
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombreDestinoFinal = nombreDestinoFinal;
        this.direccionDestinoFinal = direccionDestinoFinal;
        this.residuo = residuo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombreDestinoFinal() {
        return nombreDestinoFinal;
    }

    public void setNombreDestinoFinal(String nombreDestinoFinal) {
        this.nombreDestinoFinal = nombreDestinoFinal;
    }

    public String getDireccionDestinoFinal() {
        return direccionDestinoFinal;
    }

    public void setDireccionDestinoFinal(String direccionDestinoFinal) {
        this.direccionDestinoFinal = direccionDestinoFinal;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }
}
