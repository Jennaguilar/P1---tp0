// App.java

public class App { /*App java es como si fuera nuestro main, que nos permite crear todo lo que nosotros ibamos a trabajar dentro del main*/
    public static void main(String[] args) throws Exception {
    
        // 1) Crear materias
        Materia algebra = new Materia("Algebra", "MAT101", 6, 9.5f);
        Materia basesdedatos = new Materia("Bases de datos", "BDD201", 4, 8.0f);
        Materia programacion = new Materia("Programacion", "CS301", 8, 9.0f);

        // 2) Crear estudiantes
        Estudiante e1 = new Estudiante("Olivia", "Rodrigo", 22, "Ingenieria en sistemas", 9.5f);
        Estudiante e2 = new Estudiante("Selena", "Gomez", 21, "Arquitectura", 9.0f);
        Estudiante e3 = new Estudiante("Lautaro", "Martinez", 24, "Derecho", 8.5f);
        Estudiante e4 = new Estudiante("Bruno", "Mars", 20, "Ingenieria", 8.0f);

        // 3) Asignar materias a estudiantes
        // Olivia
        e1.agregarMateria(algebra);
        e1.agregarMateria(basesdedatos);
        e1.agregarMateria(programacion);
        //  Selena
        e2.agregarMateria(basesdedatos);
        e2.agregarMateria(programacion);
        e2.agregarMateria(algebra);
        // lautaro
        e3.agregarMateria(algebra);
        e3.agregarMateria(programacion);
        e3.agregarMateria(basesdedatos);
        // Bruno
        e4.agregarMateria(algebra);
        e4.agregarMateria(basesdedatos);
        e4.agregarMateria(programacion);

        // 4) Crear una carrera y agregar a los estudiantes
        Carrera Ingenieria = new Carrera("Ingenieria en Sistemas");
        Ingenieria.agregarEstudiante(e1);
        Ingenieria.agregarEstudiante(e2);
        Ingenieria.agregarEstudiante(e3);
        Ingenieria.agregarEstudiante(e4);
      
        //5- Crear materias y asignarlas a estudiantes
       Estudiante buscado = Ingenieria.buscarEstudiante("Selena");
        if (buscado != null) {
            System.out.println("Estudiante encontrado: " + buscado.getNombre() + " " + buscado.getApellido());
        } else {
            System.out.println("Estudiante no encontrado");
        }

        // 6- Mostrar listado de estudiantes en la carrera
        System.out.println("\n============ Lista de Estudiantes en la Carrera ============\n");
             for (Estudiante est : Ingenieria.getEstudiantes()){
        System.out.println("Promedio de : " + est.getNombre() + ": " + est.getApellido() + " | Promedio total: " + est.calcularPromedio());
       }

        // 7) universidad
        Universidad univ = new Universidad("Unvime");
        univ.agregarCarrera(Ingenieria);
        //mostrar info
        univ.mostrarinfo();

  
    }

    
    
}
