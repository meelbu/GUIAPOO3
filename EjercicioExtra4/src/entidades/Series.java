package entidades;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Scanner;

public class Series {

    private String nombre;
    private String categoria;
    private int duracion;

    private ArrayList<Series> listaSeries;

    public Series(){
        this.listaSeries = new ArrayList<>();
    }

    public Series(String nombre, String categoria, int duracion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Series> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Series> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public void crearSerie(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Series series = new Series();

        System.out.println("Ingrese el nombre de la serie a cargar");
        nombre= input.next();
        series.setNombre(nombre);

        System.out.println("Ingrese su categoria");
        categoria = input.next();
        series.setCategoria(categoria);

        System.out.println("Ingrese su duracion en minutos");
        duracion= input.nextInt();
        series.setDuracion(duracion);

        añadirSerie(series);
    }

    public void añadirSerie(Series series){
        this.listaSeries.add(series);
    }

    public void verLista(){
        for (Series series:listaSeries) {
            System.out.println(series);
        }
    }

    public void seriesMenor15Minutos(){
        for (Series i : listaSeries) {
            if (i.getDuracion()<= 15){
                System.out.println(i);
            }
        }
    }

    public void seriesMayor40Minutos(){
        for (Series i : listaSeries) {
            if (i.getDuracion() >= 40){
                System.out.println(i);
            }
        }
    }

    public void seriesRomance(){
        for (Series i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Romance") ){
                System.out.println(i);
            }
        }
    }

    public void seriesComedia(){
        for (Series i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Comedia") ){
                System.out.println(i);
            }
        }
    }

    public void seriesDrama(){
        for (Series i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Drama") ){
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return
                "Nombre:" + nombre +
                "- Categoria:" + categoria +
                "- Duracion:" + duracion;
    }
}
