import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mascota {
    private Long id;
    private String nombre;
    private String especie;
    private LocalDate edad;
    private String historialMedico;
    private List<HistorialEstado> historialEstados;
    private List<AplicacionMedicamento> aplicacionMedicamentos;

    public Mascota(Long id, String nombre, String especie, LocalDate edad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.historialEstados = new ArrayList<>();
        this.aplicacionMedicamentos = new ArrayList<>();
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + this.id +
                ", nombre='" + this.nombre + '\'' +
                ", especie='" + this.especie + '\'' +
                ", edad=" + this.edad +
                ", aplicacionMedicamentos='" + this.aplicacionMedicamentos + '\'' +
                ", historialEstados=" + this.historialEstados +
                '}';
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

    public void actualizarEstado(HistorialEstado Cambio) {
        historialEstados.add(Cambio);
    }

    public List<HistorialEstado> obtenerHistorial() {
        return historialEstados;
    }

    public List<AplicacionMedicamento> getAplicacionMedicamentos() {
        return aplicacionMedicamentos;
    }

    public void setAplicacionMedicamentos(List<AplicacionMedicamento> aplicacionMedicamentos) {
        this.aplicacionMedicamentos = aplicacionMedicamentos;
    }

    public void setAplicacionMedicamento(AplicacionMedicamento aplicacionMedicamento) {
        this.aplicacionMedicamentos.add(aplicacionMedicamento);
    }
}