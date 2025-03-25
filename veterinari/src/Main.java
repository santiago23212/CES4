import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Crear un cliente
        Cliente Ash = new Cliente(1L, "Ash", "562526", "ash@gmail.com", "calle 10");

        //Crear mascotas
        Mascota Pikachu = new Mascota(1L, "Pikachu", "Electrico", LocalDate.of(2025,03,18));
        Mascota Bulbasaur = new Mascota(2L, "Bulbasaur", "Planta", LocalDate.of(2025,03,18));
        System.out.println(Ash);
        //Añadir mascotas a un cliente
        System.out.println("Registramos las mascotas de ash");
        Ash.setMascotas(Pikachu);
        Ash.setMascotas(Bulbasaur);
        System.out.println(Ash);
        System.out.println(Pikachu);

        //Crear Estado
        Estado Atacando = new Estado(1L, "Atacando");
        //Crear Historial de estados
        HistorialEstado HistorialEstado= new HistorialEstado(1L,LocalDate.now(),"Cambia Estado");
        //Añadir HistorialEstado
        Atacando.setHistorialEstado(HistorialEstado);
        Pikachu.setHistorialEstado(Atacando.UltimoEstado());
        System.out.println("Le añadimos un estado a pikachu");
        System.out.println(Pikachu);

        //Crear un medicamento
        Medicamento Berry = new Medicamento(1L,"Berry",16,100,LocalDate.of(2025,03,23));
        //Crear Empleado
        Empleado EnfermeraJoy = new Empleado(1L,"Enfermera Joy","Veterinario","De 8 a 6","Tipo Agua");
        //Crear Aplicación
        AplicacionMedicamento ConsumeBerry = new AplicacionMedicamento(1L,LocalDate.now(),"Pikachu consume Berry");

        //Añadir Historial Faltante
        EnfermeraJoy.setHistorialEstado(Atacando.UltimoEstado());

        //añadir aplicaciones
        Pikachu.setAplicacionMedicamento(ConsumeBerry);
        EnfermeraJoy.setAplicacionMedicamento(ConsumeBerry);
        Berry.setAplicacionMedicamento(ConsumeBerry);
        System.out.println("Le añadimos un aplicación a pikachu");
        System.out.println(Pikachu);
        System.out.println(EnfermeraJoy);
        System.out.println(Berry);
        System.out.println(Atacando);




    }
}