// App.java
//import java.util.Scanner;

public class App { /*App java es como si fuera nuestro main, que nos permite crear todo lo que nosotros ibamos a trabajar dentro del main*/
    public static void main(String[] args) throws Exception {
    
        /*1-crear un objeto de la clase estudiante*/   //new Estudiante constructor vacio para crear un objeto sin valores iniciales
        Estudiante e1 = new Estudiante();  //new creando un objeto de la clase    e1→ nombre de la variable cualquiera
        e1.nombre = "Kevin";
        e1.apellido = "Lucero";
        e1.edad = 22;
        e1.carrera = "Ingenieria en sistemas";
        e1.promedio = 9.5f;

        /*2-crear un objeto de la clase estudiante usando el constructor con parametros*/
        Estudiante e2 = new Estudiante("Selena", "Gomez", 21, "Arquitectura", 9.0f);
        Estudiante e3 = new Estudiante("Lautaro", "Martinez", 24, "Derecho", 8.5f);
        
        //Guardar en un arreglo
        Estudiante[] estudiantes = {e1, e2, e3};
      
        //4- Recorrer el arreglo e imprimir los datos de cada estudiante
        for (Estudiante est : estudiantes) { //forch-each recorre cada elemento del arreglo
            System.out.println("Estudiante: " + est.nombre + " " + est.apellido + " | Promedio: " + est.promedio);
        } //est es el objeto temporal que representa cada estudiante en bucle
      
      
      
      
      
        //Estudiante maria = new("jorge", "lucero", "23","abogado", "8")*/
        
        //Materia algebra = new Materia();
    }
}
