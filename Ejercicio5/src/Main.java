import entidades.Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Alumno listaAlumno = new Alumno();
        String nombre;
        Integer nota1;
        Integer nota2;
        Integer nota3;
        String termina= "";


        listaAlumno.crearAlumno("Fer",10,9,8);
        listaAlumno.crearAlumno("Maru",10,10,10);
        listaAlumno.crearAlumno("Melina", 7,9,10);

        System.out.println("Carga de alumnos a la lista:");
        do{
            System.out.println("Ingresar el nombre");
            nombre = leer.next();
            System.out.println("Ingrese la nota 1");
            nota1 = leer.nextInt();
            System.out.println("Ingrese la nota 2");
            nota2 = leer.nextInt();
            System.out.println("Ingrese la nota 3");
            nota3 = leer.nextInt();

            System.out.println("Si desea ingresar otro alumno presione S," +
                    "de lo contrario presione cualquier tecla para salir.");
            termina = leer.next();

            listaAlumno.crearAlumno(nombre, nota1, nota2, nota3);

        }while (termina.equalsIgnoreCase("s"));

        System.out.println("\n" + "Lista de Alumnos");
        listaAlumno.verListado();


    }
}