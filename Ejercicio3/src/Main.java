
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String raza;

        ArrayList<String> razaPerro = new ArrayList<>();
        String fin = "";

        do {
            System.out.println("Ingrese una raza de perro");
            raza = input.next();

            System.out.println("Desea agregar mas razas a la lista? presione S, " +
                    "de lo contrario presione cualquier otra tecla");
            razaPerro.add(raza);

            fin = input.next();
        }while (fin. equalsIgnoreCase("S"));

        System.out.println("\n" + "Lista de Perros:");
        for (String Perros : razaPerro){
            System.out.println(Perros);
        }
    }
}