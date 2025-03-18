import java.math.BigInteger;
import java.util.Date;

public class Historial_estado {
    private BigInteger id;
    private Date fecha_hora;
    private String comentario;

    public Historial_estado() {
    }

    public Historial_estado(BigInteger id, Date fecha_hora, String comentario) {
        this.id = id;
        this.fecha_hora = fecha_hora;
        this.comentario = comentario;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
