import java.math.BigInteger;

public class Mascota {
    private BigInteger id;
    private String nombre;
    private String especie;
    private Integer edad;
    private String historial_medico;

    public Mascota() {
    }

    public Mascota(BigInteger id, String nombre, String especie, Integer edad, String historial_medico) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.historial_medico = historial_medico;
    }

    public String getHistorial_medico() {
        return historial_medico;
    }

    public void setHistorial_medico(String historial_medico) {
        this.historial_medico = historial_medico;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

