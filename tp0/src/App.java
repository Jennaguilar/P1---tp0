// App.java

public class App { /*App java es como si fuera nuestro main, que nos permite crear todo lo que nosotros ibamos a trabajar dentro del main*/
    public static void main(String[] args) throws Exception {
    
        //1- Crear estudiante usando conestructor vacio + los setters
        Estudiante e1 = new Estudiante();  // objeto en blanco
        e1.setNombre("Olivia");      //asigno nombre set con valor
        e1.setApellido("Rodrigo"); //asigno apellido set con valor
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
      
        /*5- Crear materias y asignarlas a estudiantes*/
        Materia algebra = new Materia("Algebra", "MAT101", 6, 9.5f);
        Materia basesdedatos = new Materia("Bases de datos", "BDD201", 4, 8.0f);
        Materia programacion = new Materia("Programacion", "CS301", 8, 9.0f);
        //asignar materias a estudiantes
        e1.agregarMateria(algebra);
        e1.agregarMateria(basesdedatos);
        e1.agregarMateria(programacion);

        e2.agregarMateria(basesdedatos);
        e2.agregarMateria(programacion);
        e2.agregarMateria(algebra);

        e3.agregarMateria(algebra);
        e3.agregarMateria(programacion);
        e3.agregarMateria(basesdedatos);


        //crear estudiantes y asignar materias
        Estudiante e4 = new Estudiante("Bruno", "Mars", 20, "Ingenieria", 8.0f);
        e4.agregarMateria(algebra);
        e4.agregarMateria(basesdedatos);
        e4.agregarMateria(programacion);


        //carrera
        Carrera Ingenieria = new Carrera("Ingenieria en Sistemas");
        Ingenieria.agregarEstudiante(e1);
        Ingenieria.agregarEstudiante(e2);
        Ingenieria.agregarEstudiante(e3);
        Ingenieria.agregarEstudiante(e4);




        //universidad
        Universidad univ = new Universidad("Unvime");
        univ.agregarCarrera(Ingenieria);
        //mostrar info
        univ.mostrarinfo();


        //mostrar promedio calculado
       for (Estudiante est : estudiantes){
        System.out.println("Promedio de : " + est.getNombre() + ": " + est.getApellido() + " | Promedio total: " + est.calcularPromedio());
       }
    }
}
