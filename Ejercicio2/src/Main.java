import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int numero;
        List<Integer> listaContactos = new ArrayList<>();

        String fin= "";
        do {
            System.out.println("Ingrese un numero de contacto");
            numero = input.nextInt();

            System.out.println("Desea ingresar otro contacto? - Presione s para seguir," +
                    "de lo contrario presione cualquier tecla");
            listaContactos.add(numero);

            fin= input.next();
        }while (fin. equalsIgnoreCase("s"));

        System.out.println("Su lista de contactos es la siguiente:");
        for (Integer Lista: listaContactos) {
            System.out.println(Lista);
        }

    }
}