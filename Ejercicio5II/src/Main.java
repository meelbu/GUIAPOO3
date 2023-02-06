import entidades.AlumnoServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AlumnoServicio listaAlumnos = new AlumnoServicio();
        Integer nota1;
        Integer nota2;
        Integer nota3;
        String nombre;
        String termina = "";

        listaAlumnos.crearAlumno("Maga", 6,7,8);
        listaAlumnos.crearAlumno("Fer",9,9,8);

        do{
            System.out.println("Ingrese el nombre");
            nombre= leer.next();
            System.out.println("Ingrese la nota 1");
            nota1= leer.nextInt();
            System.out.println("Ingrese la nota 2");
            nota2 = leer.nextInt();
            System.out.println("Ingrese la nota 3");
            nota3= leer.nextInt();

            System.out.println("Si desea ingresar otro alumno presione S," +
                    "de lo contrario presione cualquie tecla");
            termina= leer.next();

            listaAlumnos.crearAlumno(nombre,nota1,nota2,nota3);
        }while (termina.equalsIgnoreCase("s"));

        System.out.println("\n" + "Lista de Alumnos");
        listaAlumnos.verListado();
    }
}