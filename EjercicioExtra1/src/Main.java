import entidades.Mascota;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mascota mascota = new Mascota();
        String fin = "";

        System.out.println("Carga de datos");
        do {
            mascota.crearMascota();
            System.out.println("Si desea cargar otra mascota presione la letra S," +
                    "de lo contario presione cualquier otra tecla");
            fin = input.next();
        }while (fin.equalsIgnoreCase("s"));

        System.out.println("\n" + "Lista de mascotas:");
        mascota.verLista();

        System.out.println("\n" + "Lista de mascotas ingresadas mayores a 6 años:");
        mascota.mascotasMayores6();

        System.out.println("\n" + "Lista de mascotas ingresadas menores a 6 años:");
        mascota.mascoyasMenores5();
    }
}