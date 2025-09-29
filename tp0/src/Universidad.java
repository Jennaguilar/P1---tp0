// Universidad.java
import java.util.ArrayList; //importa el paquete para usar estructuras de datos como ArrayList

public class Universidad {
    private String nombre;
    private ArrayList<Carrera> carreras;


    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
    }


    // Metodos
    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    public void mostrarinfo() {
        System.out.println("Universidad: " + nombre);
            // recorrer carreras en el arreglo
            for (Carrera carrera : carreras) {
                System.out.println("Carrera:"+ carrera.getNombre());
                    for (Estudiante e : carrera.getEstudiantes()) {
                        System.out.println("  Estudiante: " + e.getNombre() + " " + e.getApellido());
                        System.out.println(" Promedio: " + e.calcularPromedio());
                }
             
        }
    }


}
