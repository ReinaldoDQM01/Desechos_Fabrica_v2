package Models.Entities;

import java.time.LocalDateTime;



public class Vehiculo extends BaseEntity{
    private int transportistaId;
    private Transportista transportista;
    private String tipoMedioTransporte;

    public Vehiculo(int transportistaId, Transportista transportista, String tipoMedioTransporte, Long id, LocalDateTime fechaCreacion, LocalDateTime FechaActualizacion, int estado) {
        super(id, fechaCreacion, FechaActualizacion, estado);
        this.transportistaId = transportistaId;
        this.transportista = transportista;
        this.tipoMedioTransporte = tipoMedioTransporte;
    }
   

    public String getTipoMedioTransporte() {
        return tipoMedioTransporte;
    }

    public void setTipoMedioTransporte(String tipoMedioTransporte) {
        this.tipoMedioTransporte = tipoMedioTransporte;
    }

    public int getTransportistaId() {
        return transportistaId;
    }

    public void setTransportistaId(int transportistaId) {
        this.transportistaId = transportistaId;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }
    
}
