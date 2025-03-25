import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private Long id;
    private String nombre;
    private String rol;
    private String horario;
    private String especialidad;

    private List<AplicacionMedicamento> aplicacionMedicamentos;
    private List<HistorialEstado> historialEstados;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String rol, String horario, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.horario = horario;
        this.especialidad = especialidad;
        this.aplicacionMedicamentos = new ArrayList<>();
        this.historialEstados = new ArrayList<>();
    }

    public boolean esVeterinario() {
        return "Veterinario".equalsIgnoreCase(rol);
    }

    public boolean esAdmin() {
        return "Admin".equalsIgnoreCase(rol);
    }
    public void setHistorialEstado(HistorialEstado historialEstado) {
        this.historialEstados.add(historialEstado);
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

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", rol='" + rol + '\'' +
                ", horario='" + horario + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", aplicacionMedicamentos=" + aplicacionMedicamentos +
                ", historialEstados=" + historialEstados +
                '}';
    }
}