import java.util.ArrayList;

public class Hospital {
    private String nombre;
    private String ubicacion;

    private ArrayList<Paciente> pacientes = new ArrayList<>();

    public Hospital() {
    }

    public Hospital(String nombre, String ubicacion, ArrayList<Paciente> pacientes) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}
