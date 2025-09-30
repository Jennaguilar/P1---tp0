//Carrera.java
import java.util.ArrayList; //importa el paquete para usar estructuras de datos como ArrayList

public class Carrera {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;


    // Constructor
    public Carrera(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    // Metodos
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Listado de estudiantes
    public void listarEstudiantes() {
        System.out.println("Lista de Estudiantes en la Carrera: " + nombre + ": ");
        for (Estudiante e : estudiantes) {
            System.out.println("  Estudiante: " + e.getNombre() + " " + e.getApellido());
            
        }
    }

    // Buscar estudiante por nombre
    public Estudiante buscarEstudiante(String nombre) {
        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e; // Retorna el estudiante si se encuentra
            }
        }
        return null; // Retorna null si no se encuentra
    }



}