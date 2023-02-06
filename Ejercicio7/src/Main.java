
import entidades.ProductoServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner cargar = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio Producto = new ProductoServicio();
        String tipo;
        Integer cantidad;
        Integer precioUnidad;
        String fin = "";

        do {
            System.out.println("Ingrese un producto");
            tipo = cargar.next();
            System.out.println("Ingrese la cantidad");
            cantidad = cargar.nextInt();
            System.out.println("Ingrese su precio por unidad");
            precioUnidad= cargar.nextInt();

            Producto.crearProducto(tipo,cantidad,precioUnidad);

            System.out.println("Si desea ingresar otro producto presione S," +
                    "de lo contrario ingrese cualquier otra tecla");
            fin= cargar.next();


        }while (fin.equalsIgnoreCase("s"));
        Producto.verLista();

        System.out.println("\n" + "Productos mayores a $20");
        Producto.ProductosMayores20();
        System.out.println("\n" + "Productos menores a $100");
        Producto.ProductosMenores100();


    }
}