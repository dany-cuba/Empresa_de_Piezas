package Modelo;

import java.io.Serializable;
import java.sql.Date;

public class Solicitud implements Serializable{
    private final String nombreClienteCorrespondiente;
    private final int idPiezaCorrespondiente;
    private final Date fecha;

    public Solicitud(String nombreClienteCorrespondiente, int idPiezaCorrespondiente, Date fecha) {
        this.nombreClienteCorrespondiente = nombreClienteCorrespondiente;
        this.idPiezaCorrespondiente = idPiezaCorrespondiente;
        this.fecha = fecha;
    }

    public String getNombreClienteCorrespondiente() {
        return nombreClienteCorrespondiente;
    }

    public int getIdPiezaCorrespondiente() {
        return idPiezaCorrespondiente;
    }

    public Date getFecha() {
        return fecha;
    }
    
}
