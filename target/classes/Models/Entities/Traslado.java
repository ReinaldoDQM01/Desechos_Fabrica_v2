package Models.Entities;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "traslados")
public class Traslado extends BaseEntity{
    
    @OneToOne
    @JoinColumn(name = "residuo_id")
    private Residuo residuo;
    
    @Column(name = "cantidad_trasladada")
    private int cantidadTrasladada;
    
    @ManyToOne
    @JoinColumn(name = "envase_id")
    private Envase envase;
    
    private LocalDateTime fechaLlegada;
    private double coste;

    public Traslado(Residuo residuo, int cantidadTrasladada, Envase envase, LocalDateTime fechaLlegada, double coste, long id, LocalDateTime fechaCreacion, LocalDateTime FechaActualizacion, int estado) {
        super(id, fechaCreacion, FechaActualizacion, estado);
        this.residuo = residuo;
        this.cantidadTrasladada = cantidadTrasladada;
        this.envase = envase;
        this.fechaLlegada = fechaLlegada;
        this.coste = coste;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public int getCantidadTrasladada() {
        return cantidadTrasladada;
    }

    public void setCantidadTrasladada(int cantidadTrasladada) {
        this.cantidadTrasladada = cantidadTrasladada;
    }

    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
    
    
}
