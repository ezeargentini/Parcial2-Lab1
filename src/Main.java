import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void agregarPaciente(Scanner leer, Hospital h1){
        System.out.println("Ingrese Nombre, Apellido e ID del paciente: ");
        Paciente p1 = new Paciente();
        p1.setNombre(leer.next());
        p1.setApellido(leer.next());
        p1.setIdPaciente(leer.nextInt());
        h1.getPacientes().add(p1);
        System.out.println("Paciente añadido");
    }
    public static void eliminarPaciente(Scanner leer, Hospital h1){
        mostrarPacientes(h1);
        System.out.println("Ingrese apellido del paciente a eliminar");
        String apellido = leer.next();
        for (int i = 0; i<h1.getPacientes().size(); i++){
            if (h1.getPacientes().get(i).getApellido().equals(apellido) ){
                h1.getPacientes().remove(h1.getPacientes().get(i));
                System.out.println("Paciente eliminado");
            }
        }
    }
    public static void buscarNombre(Scanner leer, Hospital h1){
        mostrarPacientes(h1);
        System.out.println("Ingrese nombre del paciente a buscar");
        String nombre = leer.next();
        for (int i = 0; i<h1.getPacientes().size(); i++){
            if (h1.getPacientes().get(i).getNombre().equals(nombre) ){
                System.out.println(h1.getPacientes().get(i).toString());
            }
        }
    }
    public static void buscarID(Scanner leer, Hospital h1){
        mostrarPacientes(h1);
        System.out.println("Ingrese apellido del paciente a buscar");
        int id = leer.nextInt();
        for (int i = 0; i<h1.getPacientes().size(); i++){
            if (h1.getPacientes().get(i).getIdPaciente() == id ){
                System.out.println(h1.getPacientes().get(i).toString());
            }
        }
    }
    public static void mostrarPacientes(Hospital h1){
        System.out.println("Lista de pacientes:");
        for (Paciente paciente: h1.getPacientes()) {
            System.out.println(paciente.toString());
        }
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opciones = 0;
        ArrayList<Paciente> pacientes = new ArrayList<>();

        Hospital h1 = new Hospital("San Antonio", "Formosa 3200", pacientes);
        h1.getPacientes().add(new Paciente("Fernando", "Salinas", 101));
        h1.getPacientes().add(new Paciente("Carlos", "Suarez", 102));
        h1.getPacientes().add(new Paciente("Ignacio", "Morichetti", 103));
        h1.getPacientes().add(new Paciente("Adolfo", "Correa", 101));
        h1.getPacientes().add(new Paciente("Natalio", "Guittler", 101));

        do{
            System.out.println("Hola! Bienvenido al hospital " + h1.getNombre() + ", que desea hacer?");
            System.out.println("(1) Agregar un paciente");
            System.out.println("(2) Eliminar un paciente");
            System.out.println("(3) Buscar un paciente por su nombre");
            System.out.println("(4) Buscar un paciente por su ID");
            System.out.println("(5) Salir");
            opciones = leer.nextInt();

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
                    opciones = 5;
                    break;
            }
        }while(opciones != 5);
        }
    }