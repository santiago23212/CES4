import java.time.LocalDate;
import java.util.Date;

public class HistorialEstado {

    private Long id;
    private LocalDate fechaHora;
    private String comentario;

    public HistorialEstado(Long id, LocalDate fechaHora, String comentario) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.comentario = comentario;
    }

    public HistorialEstado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "HistorialEstado{" +
                "id=" + id +
                ", fechaHora=" + fechaHora +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}