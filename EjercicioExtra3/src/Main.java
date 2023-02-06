import entidades.Movil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Movil movil = new Movil();
        String fin = "";

        System.out.println("Carga de lista de moviles");
        do {
            movil.crearMovil();
            System.out.println("Desea ingresar otro movil? presione la tecla S," +
                    "de lo contrario presione cualquier otra tecla");
            fin = input.next();
        }while (fin.equalsIgnoreCase("s"));

        System.out.println("\n" + "Lista de moviles:");
        movil.verLista();

        System.out.println("\n" + "Lista de marcas que contienen menos de 3 moviles");
        movil.marcaMenos3moviles();

        System.out.println("\n" + "Lista de marcas que contienen mas de 10 moviles");
        movil.marcaMas10Moviles();
    }
}