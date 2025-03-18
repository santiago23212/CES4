import java.math.BigInteger;

public class Estado
{
    private BigInteger id;
    private String nombre;

    public Estado(BigInteger id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Estado() {
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
}
