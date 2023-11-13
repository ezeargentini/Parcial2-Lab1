public class Paciente {
    private String nombre;
    private String apellido;
    private int idPaciente;
    public Paciente() {
    }

    public Paciente(String nombre, String apellido, int idPaciente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", idPaciente=" + idPaciente +
                '}';
    }
}
