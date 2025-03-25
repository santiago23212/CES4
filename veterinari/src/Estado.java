import java.util.ArrayList;
import java.util.List;

public class Estado {
    private Long id;
    private String nombre;
    private List<HistorialEstado> historialEstados;

    public Estado(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.historialEstados = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<HistorialEstado> getHistorialEstados() {
        return historialEstados;
    }

    public void setHistorialEstados(List<HistorialEstado> historialEstados) {
        this.historialEstados = historialEstados;
    }

    public void setHistorialEstado(HistorialEstado historialEstado) {
        this.historialEstados.add(historialEstado);
    }

    public HistorialEstado UltimoEstado(){
        return this.historialEstados.get(this.historialEstados.size()-1);
    }

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", historialEstados=" + historialEstados +
                '}';
    }
}