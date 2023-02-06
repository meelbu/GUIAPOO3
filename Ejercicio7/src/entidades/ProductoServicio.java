package entidades;

import java.util.*;

public class ProductoServicio {

    private ArrayList<Producto> listaProductos;

    public ProductoServicio(){
        this.listaProductos= new ArrayList<>();
    }

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void crearProducto(String tipo, Integer cantidad, Integer precioUnidad){
        Producto producto = new Producto();
        ArrayList<Integer> prod = new ArrayList<>();
        producto.setTipo(tipo);
        prod.add(cantidad);
        prod.add(precioUnidad);
        producto.setCantidad(cantidad);
        producto.setPrecioUnidad(precioUnidad);

        añadirProducto(producto);
    }

    public void añadirProducto(Producto producto){
        this.listaProductos.add(producto);
    }



    public void verLista(){
        for (Producto producto: listaProductos){
            System.out.println(producto.toString());
        }
    }

    public void ProductosMayores20(){
        for(Producto i : listaProductos){
            if (i.getPrecioUnidad() >= 20){
                System.out.println(i);
            }
        }
    }

    public void ProductosMenores100(){
        for(Producto i : listaProductos){
            if(i.getPrecioUnidad() <= 100){
                System.out.println(i);
            }
        }
    }


}
