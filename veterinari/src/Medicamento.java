import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medicamento {
    private Long id;
    private String nombre;
    private int cantidadStock;
    private double precio;
    private LocalDate fechaVencimiento;
    private List<AplicacionMedicamento> aplicacionMedicamentos;

    public Medicamento(Long id, String nombre, int cantidadStock, double precio, LocalDate fechaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadStock = cantidadStock;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.aplicacionMedicamentos = new ArrayList<>();
    }

    public Medicamento() {
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

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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

    public boolean estaVencido() {
        return this.fechaVencimiento.isAfter(LocalDate.now());
    }

    public void reducirStock(int cantidad) {
        if (cantidadStock < cantidad) {
            throw new IllegalStateException("No hay suficiente stock disponible.");
        }
        cantidadStock -= cantidad;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidadStock=" + cantidadStock +
                ", precio=" + precio +
                ", fechaVencimiento=" + fechaVencimiento +
                ", aplicacionMedicamentos=" + aplicacionMedicamentos +
                '}';
    }
}