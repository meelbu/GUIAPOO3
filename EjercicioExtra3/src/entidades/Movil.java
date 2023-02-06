package entidades;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Movil {

    private String marca;
    private int stock;

    private ArrayList<Movil> listamoviles;

    public Movil(){
        this.listamoviles = new ArrayList<>();
    }

    public Movil(String marca, int stock) {
        this.marca = marca;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Movil> getListamoviles() {
        return listamoviles;
    }

    public void setListamoviles(ArrayList<Movil> listamoviles) {
        this.listamoviles = listamoviles;
    }

    public void crearMovil(){
        Scanner input = new Scanner(System.in);
        Movil movil = new Movil();

        System.out.println("Ingrese la marca del movil:");
        marca = input.next();
        movil.setMarca(marca);

        System.out.println("Ingrese el stock actual");
        stock = input.nextInt();
        movil.setStock(stock);

        añadirMovil(movil);
    }

    public void añadirMovil(Movil movil){
        this.listamoviles.add(movil);
    }

    public void verLista(){
        for (Movil movil: listamoviles) {
            System.out.println(movil);
        }
    }

    public void marcaMenos3moviles(){
        for (Movil i : listamoviles) {
            if (i.getStock() <=3){
                System.out.println(i);
            }
        }

    }

    public void marcaMas10Moviles(){
        for (Movil i : listamoviles) {
            if (i.getStock() >= 10){
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return
                "Marca:" + marca +
                "- Stock:" + stock;
    }
}
