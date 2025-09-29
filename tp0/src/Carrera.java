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


}