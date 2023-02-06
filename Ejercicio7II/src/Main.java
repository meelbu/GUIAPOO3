import entidades.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Producto producto = new Producto();
        String fin = "";

        System.out.println("Sistema de carga de productos. A continuacion ingrese los siguientes datos:");
        do {
            producto.crearProducto();
            System.out.println("Si desea ingresar otro producto presione S," +
                    "de lo contrario presione cualquier tecla");
            fin= input.next();
        }while (fin.equalsIgnoreCase("s"));

        System.out.println("\n" + "Lista de productos ingresados:");
        producto.verLista();

        System.out.println("\n" + "Lista de productos ingresados mayor a $20");
        producto.productoMayor20();

        System.out.println("\n" + "Lista de productos ingresados menor a 100:");
        producto.productoMenor100();
    }
}