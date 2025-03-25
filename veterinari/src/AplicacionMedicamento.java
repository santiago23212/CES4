import java.time.LocalDate;
import java.util.Date;

public class AplicacionMedicamento {
    private Long id;
    private LocalDate fechaAplicacion;
    private String comentario;

    public AplicacionMedicamento(Long id, LocalDate fechaAplicacion, String comentario) {
        this.id = id;
        this.fechaAplicacion = fechaAplicacion;
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "AplicacionMedicamento{" +
                "id=" + id +
                ", fechaAplicacion=" + fechaAplicacion +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}