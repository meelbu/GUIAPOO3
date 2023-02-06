package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {

    private ArrayList<Pelicula> listaPeliculas;

    public PeliculaServicio(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public Pelicula crearPelicula(String titulo, String director, int duracionHoras){
        Pelicula pelicula = new Pelicula(titulo, director, duracionHoras);
        return pelicula;
    }

    public PeliculaServicio() {
        this.listaPeliculas = new ArrayList<>();
    }

    public ArrayList<Pelicula> agregarPelicula(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una pelicula");
        String fin = "";

        do {
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = input.next();
            System.out.println("Ingrese el director");
            String director = input.next();
            System.out.println("Ingrese la duracion en horas");
            int duracionHoras = input.nextInt();

            listaPeliculas.add(crearPelicula(titulo, director, duracionHoras));

            System.out.println("Desea ingresar otra pelicula? ingrese s," +
                    "de lo contrario presione cualquier trecla");
            fin = input.next();

        }while (fin.equalsIgnoreCase("s"));
        return listaPeliculas;
    }

    public void verListadoPeliculas(){
        for (Pelicula i : listaPeliculas ){
            System.out.println(i);
        }
    }

    public void PeliculasMayor2Horas(){
        for (Pelicula i : listaPeliculas){
            if (i.getDuracionHora() >= 2){
                System.out.println(i);
            }
        }
    }

    public void PeliculasMenor2Horas(){
        for (Pelicula i : listaPeliculas){
            if (i.getDuracionHora() < 2){
                System.out.println(i);
            }
        }
    }

}
