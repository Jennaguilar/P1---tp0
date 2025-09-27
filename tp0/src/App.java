// App.java
//import java.util.Scanner;

public class App { /*App java es como si fuera nuestro main, que nos permite crear todo lo que nosotros ibamos a trabajar dentro del main*/
    public static void main(String[] args) throws Exception {
    
        //1- Crear estudiante usando conestructor vacio + los setters
        Estudiante e1 = new Estudiante();  // objeto en blanco
        e1.setNombre("Kevin");      //asigno nombre set con valor
        e1.setApellido("Lucero"); //asigno apellido set con valor
        e1.setEdad(22);      //asigno edad set con valor
        e1.setCarrera("Ingenieria en sistemas"); //asigno carrera set con valor
        e1.setPromedio(9.5f); //asigno promedio set con valor

        //2-crear un objeto de la clase estudiante usando el constructor con parametros*/
        Estudiante e2 = new Estudiante("Selena", "Gomez", 21, "Arquitectura", 9.0f);
        Estudiante e3 = new Estudiante("Lautaro", "Martinez", 24, "Derecho", 8.5f);
        
        //Guardar en un arreglo
        Estudiante[] estudiantes = {e1, e2, e3};
      
        //4- Recorrer el arreglo e imprimir los datos de cada estudiante
        // se utiliza el get para obtener los valores de los atributos
        for (Estudiante est : estudiantes) { //forch-each recorre cada elemento del arreglo
            System.out.println("Estudiante: " + est.getNombre()+ " " + est.getApellido() + " | Promedio: " + est.getPromedio());
        } //est es el objeto temporal que representa cada estudiante en bucle
      
      
        //Materia algebra = new Materia();
    }
}
