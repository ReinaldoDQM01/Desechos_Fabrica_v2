package Models.Entities;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "transportistas")
public class Transportista extends BaseEntity{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public Transportista(String Nombre, long id, LocalDateTime fechaCreacion, LocalDateTime FechaActualizacion, int estado) {
        super(id, fechaCreacion, FechaActualizacion, estado);
        this.nombre = Nombre;
    }
}
