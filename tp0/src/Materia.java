public class Materia {
    
    //Variable estatica para ID incremental
    private static int contadorId = 1;

    //Atributos
    private Integer id;
    private String nombre;
    private String codigo;
    private int creditos;
    private String profesor;


    // constructor
    public Materia(){
        this.id = contadorId++;
    }

    /*String, Integer son clases adentro ademas de caracteres tienen funciones y procedimientos */
    public Integer getId() {
        return id;
    }
    //Id solo lectura
    //public void setId(Integer id){
    // this.id = id;
    //}

    // Constructor con parametros
    public Materia(String nombre, String codigo, int creditos, String profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.profesor = profesor;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    

    //cuando quiero imprimir algo 
    //se genero un metedo donde se retorna todos los datos
    //metodo
    public String toString(){
        return "Materia [id=]" + id + ", nombre=" + nombre + ",codigo=" + codigo + ", creditos=" + creditos + ", profesor=" + profesor + "]";
    }
}
