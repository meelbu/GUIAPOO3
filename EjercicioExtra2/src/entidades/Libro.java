package entidades;

import java.util.ArrayList;

public class Libro {

    private String titulo;
    private String autor;
    private Integer numeroPag;

    private ArrayList<Libro> listaLibros;

    public Libro(){
        this.listaLibros = new ArrayList<Libro>();
    }

    public Libro(String titulo, String autor, Integer numeroPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(Integer numeroPag) {
        this.numeroPag = numeroPag;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void crearLibro(String titulo, String autor, Integer numeroPag){
        Libro libro = new Libro();
        ArrayList<Integer> lib = new ArrayList<>();
       libro.setTitulo(titulo);
       libro.setAutor(autor);
       lib.add(numeroPag);
       libro.setNumeroPag(numeroPag);


       añadoirLibro(libro);
    }

    public void añadoirLibro(Libro libro){
        this.listaLibros.add(libro);
    }

    public void verLista(){
        for (Libro libro: listaLibros) {
            System.out.println(libro.toString());
        }
    }

   public void listaLibrosMayores300Pag(){
     for (Libro i : listaLibros) {
         if (i.getNumeroPag() >= 300){
             System.out.println(i);
         }
     }
   }

   public void listaLibrosMenores150Pag(){
       for (Libro i : listaLibros) {
           if (i.getNumeroPag() <= 150){
               System.out.println(i);
           }
       }
   }



    @Override
    public String toString() {
        return
                "Titulo:" + titulo +
                "- Autor:'" + autor +
                "- NumeroPag:" + numeroPag + "\n";
    }
}
