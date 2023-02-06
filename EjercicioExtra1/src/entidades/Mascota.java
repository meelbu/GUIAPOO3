package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Mascota {

    private String especie;
    private int edad;
    private String nombre;

    private ArrayList<Mascota> listaMascotas;

    public Mascota(){
        this.listaMascotas= new ArrayList<>();
    }

    public Mascota(String especie, int edad, String nombre) {
        this.especie = especie;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public void crearMascota(){
        Scanner input = new Scanner(System.in);
        Mascota mascota = new Mascota();

        System.out.println("Ingrese la especie de la mascota a cargar:");
        especie = input.next();
        mascota.setEspecie(especie);

        System.out.println("Ingrese el nombre de la mascota");
        nombre = input.next();
        mascota.setNombre(nombre);

        System.out.println("Ingrese su edad");
        edad = input.nextInt();
        mascota.setEdad(edad);

        añadirMascota(mascota);
    }

    public void añadirMascota(Mascota mascota){
        this.listaMascotas.add(mascota);
    }

    public void verLista(){
        for (Mascota mascota : listaMascotas) {
            System.out.println(mascota);
        }
    }

    public void mascotasMayores6(){
        for (Mascota i : listaMascotas) {
            if (i.getEdad() >= 6){
                System.out.println(i);
            }
        }
    }

    public void mascoyasMenores5(){
        for (Mascota i : listaMascotas) {
            if(i.getEdad()<= 5){
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return
                "Especie:" + especie + "\n" +
                "- Edad:" + edad + "\n" +
                "- Nombre:" + nombre + "\n";
    }
}
