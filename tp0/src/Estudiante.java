// Estudiante.java

public class Estudiante {
    //1) atributos privados encapsulados
    // con encapsulamiento no se puede acceder directamente a los atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private float promedio; 

    //2) constructor vacio
    public Estudiante(){
    }
    // constructor con parametros
    public Estudiante (String nombre, String apellido, int edad, String carrera, float promedio){
        // Usamos Setters para asignar valores a los atributos
        this.setNombre(nombre);        
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setCarrera(carrera);
        this.setPromedio(promedio);
    }

    //3) Metodos get y set
    // Setter → sirve para "leer" el valor de un atributo
    // Getter → sirve para "asignar o cambiar" un valor a un atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Validar que el nombre no sea nulo o vacío
        if (nombre == null || nombre.isEmpty()) {
            System.out.println(("El nombre no puede estar vacio"));
        }else{
        this.nombre = nombre; // this.nombre atributo de la clase
    }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
    if (apellido == null || apellido.isEmpty()) {
        System.out.println(("El apellido no puede estar vacio"));
    } else{
    this.apellido = apellido;
    }
}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // Validar que la edad debe ser mayor a 16
        if(edad < 16){
            System.out.println("La edad debe ser mayor a 16");
        } else{
            this.edad = edad;
        }
    }
 
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        // validar promedio entre 0 y 10
        if(promedio < 0 || promedio > 10){
            System.out.println("El promedio debe estar entre 0 y 10");
        } else{
            this.promedio = promedio;
        }
    }
}