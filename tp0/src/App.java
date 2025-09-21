import java.util.Scanner;

public class App { /*App java es como si fuera nuestro main, que nos permite crear todo lo que nosotros ibamos a trabajar dentro del main*/
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a=4; /*declaramos valriable entera*/
        String nombre = "Maria";


        System.out.println(4);
        System.out.println(nombre);
        /*clase: me da la potencia de crear algo nuevo y usarlo, tanto como funcion y procedimientos, poder crear un objeto de esa clase */
        Scanner sc = new Scanner(System.in); 
        /*objeto tipo scanner: para que pueda ingresar los datos
         * en c era poner la biblioteca que te permitia crear un scanf o printf
        */

        /*Estudiante maria = new("jorge", "lucero", "23","abogado", "8")*/
    
        Materia algebra = new Materia();
    
    }
}
