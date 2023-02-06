import entidades.PeliculaServicio;

public class Main {
    public static void main(String[] args) {

        PeliculaServicio servicioCarga = new PeliculaServicio();
        servicioCarga.agregarPelicula();
        System.out.println("Peliculas cargadas");
        System.out.println("-------------------");
        servicioCarga.verListadoPeliculas();

        System.out.println("\n" + "Peliculas de duracion mayor a dos horas");
        servicioCarga.PeliculasMayor2Horas();

        System.out.println("\n" + "Peliculas de duracion menor a dos horas");
        servicioCarga.PeliculasMenor2Horas();
    }
}