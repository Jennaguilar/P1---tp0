// Materia.java

public class Materia {
    //Atributos privados encapsulados
    private String nombre;
    private String codigo;
    private int creditos;
    private String profesor;
    private double calificacion;

}

    // constructor
    public Materia(){}
    //metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

     /*Constructor con parametros
    public Materia(String nombre, String codigo, int creditos, String profesor, double calificacion){ {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.profesor = profesor;
        this.calificacion = calificacion;
    }*/
    

    //cuando quiero imprimir algo 
    //se genero un metedo donde se retorna todos los datos
    //metodo
    // @Override
    public String toString(){
        return "Materia [id=]" + id + ", nombre=" + nombre + ",codigo=" + codigo + ", creditos=" + creditos + ", profesor=" + profesor + "]";
    }
}
