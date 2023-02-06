import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        List<String> listaNombres = new ArrayList<>();

        System.out.println("Ingrese la cantidad de nombres que desea registrar");
        int num = input.nextInt();

        for (int i = 0; i < num; i++ ) {
            System.out.println("Ingrese un nombre:");
            String nom = input.next();
            listaNombres.add(nom);
        }

        listaNombres.remove(2);
        listaNombres.remove(0);
        Collections.sort(listaNombres);
        int size = listaNombres.size();

        System.out.println("");
        System.out.println("Cantidad de nombres en la lista: " + size);

        System.out.println("");
        System.out.println("Lista de nombres:");

        for (String elemento : listaNombres) {
            System.out.println(elemento);
        }

    }
}