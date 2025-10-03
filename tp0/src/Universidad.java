// Universidad.java
import java.util.ArrayList; //importa el paquete para usar estructuras de datos como ArrayList

public class Universidad {
    private String nombre;
    private String direccion;
    private ArrayList<Carrera> carreras;


    // Constructor
    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.carreras = new ArrayList<>();
    }


    // Metodos
    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    public void mostrarinfo() {
        System.out.println("Universidad: " + nombre);
        System.out.println("Direccion: " + direccion);
            // recorrer carreras en el arreglo
            for (Carrera carrera : carreras) {
                System.out.println("Carrera:"+ carrera.getNombre());
                    for (Estudiante e : carrera.getEstudiantes()) {
                        System.out.println("Estudiante: " + e.getNombre() + " " + e.getApellido());
                        System.out.println("Promedio: " + e.calcularPromedio());
                }
             
        }
    }


}
