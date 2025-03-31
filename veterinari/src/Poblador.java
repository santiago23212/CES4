import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Poblador {
    Scanner scanner = new Scanner(System.in);
    List<Cliente> clientes = new ArrayList<>();
    List<Mascota> mascotas = new ArrayList<>();
    List<Medicamento> medicamentos = new ArrayList<>();
    List<Empleado> empleados = new ArrayList<>();
    List<Estado> estados = new ArrayList<>();
    List<Aplicacion> aplicaciones = new ArrayList<>();
    List<HistorialEstado> historialEstados = new ArrayList<>();

    public Poblador() {
        // =====================================================
        // CLIENTES
        // =====================================================
        Cliente ash = new Cliente(1, "Ash Ketchum", "Pallet Town", "ash@pokemon.com", "123456789");
        Cliente misty = new Cliente(2, "Misty", "Cerulean City", "misty@pokemon.com", "987654321");
        Cliente brock = new Cliente(3, "Brock", "Pewter City", "brock@pokemon.com", "456789123");
        Cliente jessie = new Cliente(4, "Jessie", "Team Rocket HQ", "jessie@pokemon.com", "789123456");
        Cliente james = new Cliente(5, "James", "Team Rocket HQ", "james@pokemon.com", "321654987");
        Cliente gary = new Cliente(6, "Gary Oak", "Pallet Town", "gary@pokemon.com", "112233445");
        Cliente tracey = new Cliente(7, "Tracey Sketchit", "Orange Islands", "tracey@pokemon.com", "556677889");
        Cliente nurseJoy = new Cliente(8, "Nurse Joy", "Pokémon Center", "joy@pokemon.com", "999888777");
        Cliente officerJenny = new Cliente(9, "Officer Jenny", "Viridian City", "jenny@pokemon.com", "101010101");
        Cliente professorOak = new Cliente(10, "Professor Oak", "Pallet Town", "oak@pokemon.com", "202020202");

        clientes.add(ash);
        clientes.add(misty);
        clientes.add(brock);
        clientes.add(jessie);
        clientes.add(james);
        clientes.add(gary);
        clientes.add(tracey);
        clientes.add(nurseJoy);
        clientes.add(officerJenny);
        clientes.add(professorOak);

        // =====================================================
        // MASCOTAS
        // =====================================================
        // Ash's Pokémon
        Mascota pikachu = new Mascota(1, "Pikachu", "Electric", LocalDate.of(2020, 5, 15));
        Mascota charizard = new Mascota(2, "Charizard", "Fire/Flying", LocalDate.of(2019, 8, 20));
        Mascota bulbasaur = new Mascota(3, "Bulbasaur", "Grass/Poison", LocalDate.of(2021, 3, 10));
        ash.addMascota(pikachu);
        ash.addMascota(charizard);
        ash.addMascota(bulbasaur);
        pikachu.setCliente(ash);
        charizard.setCliente(ash);
        bulbasaur.setCliente(ash);

        // Misty's Pokémon
        Mascota starmie = new Mascota(4, "Starmie", "Water/Psychic", LocalDate.of(2020, 7, 5));
        Mascota psyduck = new Mascota(5, "Psyduck", "Water", LocalDate.of(2022, 1, 12));
        Mascota golduck = new Mascota(6, "Golduck", "Water", LocalDate.of(2021, 9, 30));
        misty.addMascota(starmie);
        misty.addMascota(psyduck);
        misty.addMascota(golduck);
        starmie.setCliente(misty);
        psyduck.setCliente(misty);
        golduck.setCliente(misty);

        // Brock's Pokémon
        Mascota onix = new Mascota(7, "Onix", "Rock/Ground", LocalDate.of(2018, 11, 18));
        Mascota geodude = new Mascota(8, "Geodude", "Rock/Ground", LocalDate.of(2023, 4, 22));
        brock.addMascota(onix);
        brock.addMascota(geodude);
        onix.setCliente(brock);
        geodude.setCliente(brock);

        // Jessie's Pokémon
        Mascota meowth = new Mascota(9, "Meowth", "Normal", LocalDate.of(2022, 6, 14));
        Mascota arbok = new Mascota(10, "Arbok", "Poison", LocalDate.of(2020, 12, 1));
        jessie.addMascota(meowth);
        jessie.addMascota(arbok);
        meowth.setCliente(jessie);
        arbok.setCliente(jessie);

        // James's Pokémon
        Mascota growlie = new Mascota(11, "Growlie", "Poison", LocalDate.of(2021, 2, 8));
        Mascota weezing = new Mascota(12, "Weezing", "Poison", LocalDate.of(2019, 5, 25));
        james.addMascota(growlie);
        james.addMascota(weezing);
        growlie.setCliente(james);
        weezing.setCliente(james);

        // Gary's Pokémon
        Mascota eevee = new Mascota(13, "Eevee", "Normal", LocalDate.of(2023, 8, 17));
        gary.addMascota(eevee);
        eevee.setCliente(gary);

        // Tracey's Pokémon
        Mascota marill = new Mascota(14, "Marill", "Water/Fairy", LocalDate.of(2022, 11, 3));
        tracey.addMascota(marill);
        marill.setCliente(tracey);

        mascotas.add(pikachu);
        mascotas.add(charizard);
        mascotas.add(bulbasaur);
        mascotas.add(starmie);
        mascotas.add(psyduck);
        mascotas.add(golduck);
        mascotas.add(onix);
        mascotas.add(geodude);
        mascotas.add(meowth);
        mascotas.add(arbok);
        mascotas.add(growlie);
        mascotas.add(weezing);
        mascotas.add(eevee);
        mascotas.add(marill);

        // =====================================================
        // MEDICAMENTOS
        // =====================================================
        Medicamento antibiotico = new Medicamento(1, "Antibiótico", 50, 12.5, LocalDate.of(2024, 5, 20));
        Medicamento vacunaRabia = new Medicamento(2, "Vacuna Rabia", 30, 25.0, LocalDate.of(2025, 3, 15));
        Medicamento desparasitante = new Medicamento(3, "Desparasitante", 100, 8.0, LocalDate.of(2023, 12, 31));
        Medicamento antiinflamatorio = new Medicamento(4, "Antiinflamatorio", 45, 18.75, LocalDate.of(2024, 8, 10));
        Medicamento analgesico = new Medicamento(5, "Analgesico", 70, 9.99, LocalDate.of(2024, 9, 5));
        Medicamento vitaminas = new Medicamento(6, "Vitaminas", 200, 4.50, LocalDate.of(2025, 1, 1));
        Medicamento suero = new Medicamento(7, "Suero", 25, 30.0, LocalDate.of(2024, 7, 22));
        Medicamento pomada = new Medicamento(8, "Pomada Antifúngica", 60, 15.20, LocalDate.of(2024, 11, 30));
        Medicamento antiparasitario = new Medicamento(9, "Antiparasitario", 80, 10.0, LocalDate.of(2024, 12, 15));
        Medicamento sedante = new Medicamento(10, "Sedante", 15, 45.0, LocalDate.of(2024, 10, 10));

        medicamentos.add(antibiotico);
        medicamentos.add(vacunaRabia);
        medicamentos.add(desparasitante);
        medicamentos.add(antiinflamatorio);
        medicamentos.add(analgesico);
        medicamentos.add(vitaminas);
        medicamentos.add(suero);
        medicamentos.add(pomada);
        medicamentos.add(antiparasitario);
        medicamentos.add(sedante);

        // =====================================================
        // EMPLEADOS
        // =====================================================
        Empleado juan = new Empleado(1, "Juan Pérez", "Veterinario");
        Empleado ana = new Empleado(2, "Ana Gómez", "Asistente");
        Empleado carlos = new Empleado(3, "Carlos Ruiz", "Farmacéutico");
        Empleado maria = new Empleado(4, "María López", "Recepcionista");
        Empleado luis = new Empleado(5, "Luis Fernández", "Veterinario");
        Empleado sofia = new Empleado(6, "Sofía Martínez", "Técnico de Laboratorio");

        empleados.add(juan);
        empleados.add(ana);
        empleados.add(carlos);
        empleados.add(maria);
        empleados.add(luis);
        empleados.add(sofia);

        // =====================================================
        // ESTADOS
        // =====================================================
        Estado enTratamiento = new Estado(1, "En tratamiento");
        Estado recuperado = new Estado(2, "Recuperado");
        Estado pendiente = new Estado(3, "Pendiente");
        Estado enObservacion = new Estado(4, "En observación");
        Estado critico = new Estado(5, "Crítico");
        Estado alta = new Estado(6, "Alta");
        Estado cirugia = new Estado(7, "Cirugía programada");

        estados.add(enTratamiento);
        estados.add(recuperado);
        estados.add(pendiente);
        estados.add(enObservacion);
        estados.add(critico);
        estados.add(alta);
        estados.add(cirugia);

        // =====================================================
        // APLICACIONES
        // =====================================================
        Aplicacion aplicacion1 = new Aplicacion(1, "Primera dosis", LocalDate.of(2023, 10, 1));
        aplicacion1.setMedicamento(antibiotico);
        aplicacion1.setMascota(pikachu);
        aplicacion1.setEmpleado(juan);

        Aplicacion aplicacion2 = new Aplicacion(2, "Vacuna anual", LocalDate.of(2023, 11, 15));
        aplicacion2.setMedicamento(vacunaRabia);
        aplicacion2.setMascota(starmie);
        aplicacion2.setEmpleado(ana);

        Aplicacion aplicacion3 = new Aplicacion(3, "Desparasitación mensual", LocalDate.of(2023, 12, 1));
        aplicacion3.setMedicamento(desparasitante);
        aplicacion3.setMascota(bulbasaur);
        aplicacion3.setEmpleado(luis);

        Aplicacion aplicacion4 = new Aplicacion(4, "Antiinflamatorio post-cirugía", LocalDate.of(2023, 9, 20));
        aplicacion4.setMedicamento(antiinflamatorio);
        aplicacion4.setMascota(charizard);
        aplicacion4.setEmpleado(juan);

        Aplicacion aplicacion5 = new Aplicacion(5, "Vitaminas para pelaje", LocalDate.of(2023, 10, 10));
        aplicacion5.setMedicamento(vitaminas);
        aplicacion5.setMascota(psyduck);
        aplicacion5.setEmpleado(ana);

        Aplicacion aplicacion6 = new Aplicacion(6, "Suero para deshidratación", LocalDate.of(2023, 11, 5));
        aplicacion6.setMedicamento(suero);
        aplicacion6.setMascota(golduck);
        aplicacion6.setEmpleado(luis);

        Aplicacion aplicacion7 = new Aplicacion(7, "Pomada para hongos", LocalDate.of(2023, 12, 10));
        aplicacion7.setMedicamento(pomada);
        aplicacion7.setMascota(onix);
        aplicacion7.setEmpleado(ana);

        Aplicacion aplicacion8 = new Aplicacion(8, "Antiparasitario mensual", LocalDate.of(2023, 9, 30));
        aplicacion8.setMedicamento(antiparasitario);
        aplicacion8.setMascota(geodude);
        aplicacion8.setEmpleado(juan);

        Aplicacion aplicacion9 = new Aplicacion(9, "Sedante para viaje", LocalDate.of(2023, 10, 15));
        aplicacion9.setMedicamento(sedante);
        aplicacion9.setMascota(meowth);
        aplicacion9.setEmpleado(ana);

        Aplicacion aplicacion10 = new Aplicacion(10, "Vacuna anual", LocalDate.of(2023, 11, 30));
        aplicacion10.setMedicamento(vacunaRabia);
        aplicacion10.setMascota(arbok);
        aplicacion10.setEmpleado(luis);

        Aplicacion aplicacion11 = new Aplicacion(11, "Vitaminas para pelaje", LocalDate.of(2023, 12, 5));
        aplicacion11.setMedicamento(vitaminas);
        aplicacion11.setMascota(growlie);
        aplicacion11.setEmpleado(ana);

        Aplicacion aplicacion12 = new Aplicacion(12, "Suero para deshidratación", LocalDate.of(2023, 9, 25));
        aplicacion12.setMedicamento(suero);
        aplicacion12.setMascota(weezing);
        aplicacion12.setEmpleado(juan);

        Aplicacion aplicacion13 = new Aplicacion(13, "Pomada para hongos", LocalDate.of(2023, 10, 5));
        aplicacion13.setMedicamento(pomada);
        aplicacion13.setMascota(eevee);
        aplicacion13.setEmpleado(ana);

        Aplicacion aplicacion14 = new Aplicacion(14, "Antiparasitario mensual", LocalDate.of(2023, 11, 10));
        aplicacion14.setMedicamento(antiparasitario);
        aplicacion14.setMascota(marill);
        aplicacion14.setEmpleado(luis);

        Aplicacion aplicacion15 = new Aplicacion(15, "Sedante para viaje", LocalDate.of(2023, 12, 15));
        aplicacion15.setMedicamento(sedante);
        aplicacion15.setMascota(pikachu);
        aplicacion15.setEmpleado(ana);

        Aplicacion aplicacion16 = new Aplicacion(16, "Vacuna anual", LocalDate.of(2024, 9, 20));
        aplicacion16.setMedicamento(vacunaRabia);
        aplicacion16.setMascota(starmie);
        aplicacion16.setEmpleado(luis);

        Aplicacion aplicacion17 = new Aplicacion(17, "Vitaminas para pelaje", LocalDate.of(2023, 10, 25));
        aplicacion17.setMedicamento(vitaminas);
        aplicacion17.setMascota(psyduck);
        aplicacion17.setEmpleado(ana);

        Aplicacion aplicacion18 = new Aplicacion(18, "Suero para deshidratación", LocalDate.of(2023, 11, 10));
        aplicacion18.setMedicamento(suero);
        aplicacion18.setMascota(golduck);
        aplicacion18.setEmpleado(juan);

        Aplicacion aplicacion19 = new Aplicacion(19, "Pomada para hongos", LocalDate.of(2023, 12, 15));
        aplicacion19.setMedicamento(pomada);
        aplicacion19.setMascota(onix);
        aplicacion19.setEmpleado(ana);

        Aplicacion aplicacion20 = new Aplicacion(20, "Antiparasitario mensual", LocalDate.of(2023, 9, 30));
        aplicacion20.setMedicamento(antiparasitario);
        aplicacion20.setMascota(geodude);
        aplicacion20.setEmpleado(luis);

        aplicaciones.add(aplicacion1);
        aplicaciones.add(aplicacion2);
        aplicaciones.add(aplicacion3);
        aplicaciones.add(aplicacion4);
        aplicaciones.add(aplicacion5);
        aplicaciones.add(aplicacion6);
        aplicaciones.add(aplicacion7);
        aplicaciones.add(aplicacion8);
        aplicaciones.add(aplicacion9);
        aplicaciones.add(aplicacion10);
        aplicaciones.add(aplicacion11);
        aplicaciones.add(aplicacion12);
        aplicaciones.add(aplicacion13);
        aplicaciones.add(aplicacion14);
        aplicaciones.add(aplicacion15);
        aplicaciones.add(aplicacion16);
        aplicaciones.add(aplicacion17);
        aplicaciones.add(aplicacion18);
        aplicaciones.add(aplicacion19);
        aplicaciones.add(aplicacion20);

        // =====================================================
        // HISTORIAL DE ESTADOS
        // =====================================================
        HistorialEstado historial1 = new HistorialEstado(1, LocalDate.of(2024, 10, 2), juan, pikachu, enTratamiento);
        HistorialEstado historial2 = new HistorialEstado(2, LocalDate.of(2023, 11, 16), ana, starmie, recuperado);
        HistorialEstado historial3 = new HistorialEstado(3, LocalDate.of(2023, 12, 2), luis, charizard, alta);
        HistorialEstado historial4 = new HistorialEstado(4, LocalDate.of(2023, 9, 25), juan, bulbasaur, enObservacion);
        HistorialEstado historial5 = new HistorialEstado(5, LocalDate.of(2023, 10, 5), ana, psyduck, pendiente);
        HistorialEstado historial6 = new HistorialEstado(6, LocalDate.of(2023, 11, 20), juan, golduck, enTratamiento);
        HistorialEstado historial7 = new HistorialEstado(7, LocalDate.of(2023, 12, 5), ana, onix, enTratamiento);
        HistorialEstado historial8 = new HistorialEstado(8, LocalDate.of(2023, 9, 30), luis, geodude, enTratamiento);
        HistorialEstado historial9 = new HistorialEstado(9, LocalDate.of(2023, 10, 15), juan, meowth, enTratamiento);
        HistorialEstado historial10 = new HistorialEstado(10, LocalDate.of(2023, 11, 30), ana, arbok, enTratamiento);
        HistorialEstado historial11 = new HistorialEstado(11, LocalDate.of(202, 12, 5), luis, growlie, enTratamiento);
        HistorialEstado historial12 = new HistorialEstado(12, LocalDate.of(2024, 9, 25), juan, weezing, enTratamiento);
        HistorialEstado historial13 = new HistorialEstado(13, LocalDate.of(2024, 10, 16), ana, eevee, critico);
        HistorialEstado historial14 = new HistorialEstado(14, LocalDate.of(2024, 11, 10), luis, marill, critico);
        HistorialEstado historial15 = new HistorialEstado(15, LocalDate.of(2024, 12, 15), juan, pikachu, critico);

        historialEstados.add(historial1);
        historialEstados.add(historial2);
        historialEstados.add(historial3);
        historialEstados.add(historial4);
        historialEstados.add(historial5);
        historialEstados.add(historial6);
        historialEstados.add(historial7);
        historialEstados.add(historial8);
        historialEstados.add(historial9);
        historialEstados.add(historial10);
        historialEstados.add(historial11);
        historialEstados.add(historial12);
        historialEstados.add(historial13);
        historialEstados.add(historial14);
        historialEstados.add(historial15);
    }

    //Muestra cada cliente junto con el número de mascotas que posee, o incluso los nombres de sus mascotas. Basico
    public void ClienteyMascotas() {
        this.clientes.forEach(cliente-> {
            System.out.println("El entrenador "+cliente.getNombre()+", tiene "+ cliente.getMascotas().size()+" mascotas");
            if (!cliente.getMascotas().isEmpty()) {
                //cliente.getMascotas().forEach(mascota-> System.out.println(mascota.getNombre()));
                String nombres= cliente.getMascotas().stream().map(Mascota::getNombre).collect(Collectors.joining(", "));
                System.out.println(nombres);
            }
        });
    }
    public void ClienteyMascotas2() {
        this.clientes.forEach(cliente -> {
            String resultado = "El entrenador " + cliente.getNombre() + ", tiene " + cliente.getMascotas().size() + " mascotas";

            if (!cliente.getMascotas().isEmpty()) {
                String nombres = cliente.getMascotas().stream()
                        .map(Mascota::getNombre)
                        .collect(Collectors.joining(", "));
                resultado += ": " + nombres;
            }

            System.out.println(resultado);
        });
    }
    //Muestra todos los medicamentos, su cantidad en stock y destaca aquellos con stock bajo. Basico
    public void MedicamentosyBajoStock() {
        this.medicamentos.forEach(medicamento -> {
            String resultado  = "Nombre: "+medicamento.getNombre()+ ", Cantidad: "+medicamento.getCantidadStock();
            String resultado2 = medicamento.getCantidadStock()<=30?", STOCK BAJO ":"";
            System.out.println(resultado+resultado2);
        });
    }
    //Resume cuántas mascotas hay de cada especie (por ejemplo, “Eléctrico”, “Planta”, “Fuego”, “Agua”, etc.). Basico
    public void TipoyCantidad() {
        this.mascotas.stream().
                collect(Collectors.groupingBy(mascota->mascota.getTipo(),Collectors.counting())).
                forEach((tipo,cantidad)-> System.out.println("Tipo "+tipo+": "+", cantiadad: "+cantidad));
    }
    //Listar mascotas en estado "Crítico" ordenadas por fecha de registro. Basico
    public void EstadoCritico() {
        this.historialEstados.stream().filter(HE -> HE.getEstado().getNombre().equals("Crítico")).
                sorted((h1, h2) -> h2.getFechaCambio().compareTo(h1.getFechaCambio())).
                forEach(HE -> System.out.println(HE.getMascota().getNombre()+" "+ HE.getFechaCambio()));
    }
    //Detalla cuántas aplicaciones de medicamentos ha realizado cada veterinario durante un período determinado. Esencial
    public void AplicacionesdeEmpleadoFecha() {
        System.out.print("Ingrese la fecha (yyyy-MM-dd): ");
        String fecha = scanner.nextLine();
        this.aplicaciones.stream().filter(aplicacion -> aplicacion.getFechaAplicacion()
                        .isEqual(LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"))))
                .collect(Collectors.groupingBy(aplicacion -> aplicacion.getEmpleado().getNombre(), Collectors.counting()))
                .forEach((nombre,cantidad)-> System.out.println("Empleado: "+nombre+" aplicaciones: "+cantidad));
    }
    //Para una mascota seleccionada, muestra la evolución de sus estados. Esencial
    public void HistorialEstadosEspecifico() {
        System.out.println("Identificacion de la mascota: ");
        int codmas = Integer.parseInt(scanner.nextLine());
        System.out.println("Historial de estados de " +
                this.historialEstados.stream()
                        .filter(HE -> HE.getMascota().getId() == codmas)
                        .map(HE -> HE.getMascota().getNombre())
                        .findFirst()
                        .orElse("Mascota no encontrada")
        );
        this.historialEstados.stream().filter(HE-> HE.getMascota().getId()== codmas).
                sorted((h1, h2) -> h1.getFechaCambio().compareTo(h2.getFechaCambio())).
                forEach(HE -> System.out.println("Fecha: "+HE.getFechaCambio()+" Estado: "+ HE.getEstado().getNombre()));
    }
    //Clientes con mas visitas medicas en el ultimo semestre. Esencial
    public void VisitasUltimoSemestre() {
        LocalDate fechaReferencia =  LocalDate.now();
        int mesActual = fechaReferencia.getMonthValue();
        int semestreActual = mesActual <= 6 ? 1 : 2;
        int aNoActual = fechaReferencia.getYear();
        LocalDate iniciosemestreanterior = semestreActual==1?
                LocalDate.of(aNoActual-1, 6, 30)
                : LocalDate.of(aNoActual-1, 12, 30);
        LocalDate finsemestreanterior = semestreActual==1?
                LocalDate.of(aNoActual, 1, 1)
                : LocalDate.of(aNoActual, 7, 1);
        this.historialEstados.stream().filter(he -> he.getFechaCambio().isAfter(iniciosemestreanterior) && he.getFechaCambio().isBefore(finsemestreanterior))
                .collect(Collectors.groupingBy(he-> Map.entry(he.getMascota().getCliente().getId(), he.getMascota().getCliente().getNombre()), Collectors.counting())).
                forEach((clienteInfo, cantidad) -> {
                    System.out.println("Cliente ID: " + clienteInfo.getKey() +
                            ", Nombre: " + clienteInfo.getValue() +
                            ", Cantidad de visitas medicas: " + cantidad);});

    }
    //Mascotas que requieren vacuna en el mes actual. Esencial
    public void NecesitaVacuna() {
        int mesActual = LocalDate.now().getMonthValue();
        int anioActual = LocalDate.now().getYear();
        System.out.println("Necesitan Vacuna: ");
        this.aplicaciones.stream().filter(apli-> apli.getComentario()
                        .contains("Vacuna"))
                .filter(apli-> apli.getFechaAplicacion().isBefore(LocalDate.of(anioActual - 1, mesActual, 1)))
                .sorted((a1, a2) -> a1.getFechaAplicacion().compareTo(a2.getFechaAplicacion()))
                .forEach(apli -> System.out.println("Nombre: "+ apli.getMascota().getNombre()+ " Fecha de aplicación anterior: "+apli.getFechaAplicacion()));

    }
    //Resumen del uso de cada medicamento, mostrando la cantidad de aplicaciones realizadas y, opcionalmente, el total de stock utilizado. Esencial
    public void UsoMedicamento() {
        this.medicamentos.stream()
                .sorted(Comparator.comparing(Medicamento::getNombre))
                .forEach(med -> {
                    long count = this.aplicaciones.stream()
                            .filter(a -> a.getMedicamento().equals(med))
                            .count();
                    double stockUsado = (double) count * med.getCantidadStock();

                    System.out.println("Medicamento: "+med.getNombre()+ " Cantidad: "+count + " Stock Usado: "+stockUsado);
                });
    }
    //Calcular el total de ventas diarias de medicamentos.
    public void TotalDia() {
        LocalDate fecha = LocalDate.of(2023, 9, 30);
        double total = this.aplicaciones.stream()
                .filter(a -> a.getFechaAplicacion().equals(fecha))
                .mapToDouble(a -> a.getMedicamento().getPrecio())
                .sum();

        System.out.println("\nTotal de ventas para: " + fecha + ":"  + total);
    }


}