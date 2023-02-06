import entidades.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Libro libro = new Libro();
        String titulo;
        String autor;
        Integer numeroPag= 0;
        String fin = "";

        System.out.println("Carga de libros");

        do {
            System.out.println("Ingrese el titulo del libro:");
            titulo = input.next();
            System.out.println("Ingrese el autor:");
            autor = input.next();
            System.out.println("Ingrese la cantidad de paginas:");
            numeroPag = input.nextInt();

            System.out.println("Si dese ingresar otro libro presione la letra S," +
                    "de lo contrario presione cualquier otra tecla");
            fin = input.next();

            libro.crearLibro(titulo,autor,numeroPag);

        }while (fin.equalsIgnoreCase("s"));

        System.out.println("Lista de libros:");
        libro.verLista();

        System.out.println("Lista de libros con cantidad de paginas mayores a 300");
        libro.listaLibrosMayores300Pag();

        System.out.println("Lista de libros con cantidad de paginas menores a 150");
        libro.listaLibrosMenores150Pag();

    }
}