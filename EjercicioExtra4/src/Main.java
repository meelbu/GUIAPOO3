import entidades.Series;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Series series = new Series();
        String fin = "";

        System.out.println("Sistema de carga de series");
        do {
            series.crearSerie();
            System.out.println("Si desea ingresar otra serie presione la tecla S," +
                    "de lo contrario presione cualquier otra tecla");
            fin = input.next();

        }while (fin.equalsIgnoreCase("s"));

        System.out.println("\n" + "Lista de series ingresadas:");
        series.verLista();

        System.out.println("\n" + "Lista de series menores a 15 minutos");
        series.seriesMenor15Minutos();

        System.out.println("\n" + "Lista de series mayores a 40 minutos");
        series.seriesMayor40Minutos();

        System.out.println("\n" + "Lista de series de categoria ROMANCE");
        series.seriesRomance();

        System.out.println("\n" + "Lista de series de categoria COMEDIA");
        series.seriesComedia();

        System.out.println("\n" + "Lista de series de categoria DRAMA");
        series.seriesDrama();

    }
}