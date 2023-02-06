import java.util.*;

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

        Iterator<String> raza1 = razaPerro.iterator();
        while (raza1.hasNext()){
            System.out.println(raza1.next());
        }
        System.out.println("");
        System.out.println("Ingrese la raza de perro que quiera eliminar");
        raza= input.next();

        Collections.sort(razaPerro);

        if (razaPerro.contains(raza)){
            razaPerro.remove(raza);
            System.out.println("LISTA DE PERROS ACTUALIZADA:");
            for (String Perros : razaPerro){
                System.out.println(Perros);
            }
        }else {
            System.out.println("El perro no se encuentra en la lista");
            System.out.println("LISTA DE PERROS:");
            for (String Perros : razaPerro){
                System.out.println(Perros);
            }
        }
    }
    }
