// Materia.java

public class Materia {
    //Atributos privados encapsulados
    private String nombre;
    private String codigo;
    private int creditos;
    private double calificacion;



    // constructor vacio
    public Materia(){}

    //constructor con parametros
    public Materia(String nombre, String codigo, int creditos, double calificacion){
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.setCalificacion(calificacion);
    }


    //metodos getters y setters con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio");
    } else {
        this.nombre = nombre;
    }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0 || calificacion > 10) {
            System.out.println("La calificacion debe estar entre 0 y 10");
        } else {
            this.calificacion = calificacion;
        }
    }

    //cuando quiero imprimir algo 
    //se genero un metedo donde se retorna todos los datos
    //metodo
    // @Override
    /*public String toString(){
        return "Materia [id=]" + id + ", nombre=" + nombre + ",codigo=" + codigo + ", creditos=" + creditos + ", profesor=" + profesor + "]";
    }*/
}
