import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Método para agregar un nuevo paciente al hospital
    public static void agregarPaciente(Scanner leer, Hospital h1){
        System.out.println("Ingrese Nombre, Apellido e ID del paciente: ");
        Paciente p1 = new Paciente();
        p1.setNombre(leer.next());
        p1.setApellido(leer.next());
        p1.setIdPaciente(leer.nextInt());
        h1.getPacientes().add(p1);
        System.out.println("Paciente añadido");
    }

    // Método para eliminar un paciente por apellido
    public static void eliminarPaciente(Scanner leer, Hospital h1){
        mostrarPacientes(h1);
        System.out.println("Ingrese apellido del paciente a eliminar");
        String apellido = leer.next();
        for (int i = 0; i < h1.getPacientes().size(); i++){
            if (h1.getPacientes().get(i).getApellido().equals(apellido) ){
                h1.getPacientes().remove(h1.getPacientes().get(i));
                System.out.println("Paciente eliminado");
            }
        }
    }

    // Método para buscar pacientes por nombre utilizando streams
    public static void buscarNombre(Scanner leer, Hospital h1) {
        System.out.println("Ingrese nombre del paciente a buscar");
        String nombre = leer.next();
        h1.getPacientes().stream()
                .filter(paciente -> paciente.getNombre().equals(nombre))
                .forEach(paciente -> System.out.println(paciente.toString()));
    }

    // Método para buscar paciente por ID
    public static void buscarID(Scanner leer, Hospital h1) {
        System.out.println("Ingrese ID del paciente a buscar");
        int id = leer.nextInt();
        for (Paciente paciente : h1.getPacientes()) {
            if (paciente.getIdPaciente() == id) {
                System.out.println(paciente.toString());
                return;
            }
        }
        System.out.println("No se encontró un paciente con el ID proporcionado.");
    }

    // Método para mostrar la lista de pacientes en el hospital
    public static void mostrarPacientes(Hospital h1){
        System.out.println("Lista de pacientes:");
        for (Paciente paciente: h1.getPacientes()) {
            System.out.println(paciente.toString());
        }
    }

    // Método principal (main) del programa
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opciones = 0;
        ArrayList<Paciente> pacientes = new ArrayList<>();

        // Creación del hospital con algunos pacientes iniciales
        Hospital h1 = new Hospital("San Antonio", "Formosa 3200", pacientes);
        h1.getPacientes().add(new Paciente("Fernando", "Salinas", 101));
        h1.getPacientes().add(new Paciente("Carlos", "Suarez", 102));
        h1.getPacientes().add(new Paciente("Ignacio", "Morichetti", 103));
        h1.getPacientes().add(new Paciente("Adolfo", "Correa", 104));
        h1.getPacientes().add(new Paciente("Natalio", "Guittler", 105));

        // Menú de opciones en un bucle do-while
        do {
            System.out.println("Hola! Bienvenido al hospital " + h1.getNombre() + ", ¿qué desea hacer?");
            System.out.println("(1) Agregar un paciente");
            System.out.println("(2) Eliminar un paciente");
            System.out.println("(3) Buscar un paciente por su nombre");
            System.out.println("(4) Buscar un paciente por su ID");
            System.out.println("(5) Mostrar lista de pacientes");
            System.out.println("(6) Salir");
            opciones = leer.nextInt();

            // Switch para manejar las diferentes opciones del usuario
            switch (opciones){
                case 1:
                    agregarPaciente(leer, h1);
                    break;
                case 2:
                    eliminarPaciente(leer, h1);
                    break;
                case 3:
                    buscarNombre(leer, h1);
                    break;
                case 4:
                    buscarID(leer, h1);
                    break;
                case 5:
                    mostrarPacientes(h1);
                    break;
                case 6:
                    opciones = 6;  // Salir del bucle
                    break;
            }
        } while(opciones != 6);  // Bucle continuará hasta que el usuario elija salir
    }
}
