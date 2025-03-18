import java.math.BigInteger;
import java.util.Date;

public class Aplicacion {
    private BigInteger id;
    private Date fecha_aplicacion;
    private String Comentario;

    public Aplicacion() {
    }

    public Aplicacion(BigInteger id, Date fecha_aplicacion, String comentario) {
        this.id = id;
        this.fecha_aplicacion = fecha_aplicacion;
        Comentario = comentario;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Date getFecha_aplicacion() {
        return fecha_aplicacion;
    }

    public void setFecha_aplicacion(Date fecha_aplicacion) {
        this.fecha_aplicacion = fecha_aplicacion;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }
}
