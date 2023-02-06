package entidades;

import java.util.ArrayList;

public class Producto {

    private String tipo;
    private Integer cantidad;
    private Integer precioUnidad;

    public Producto() {
    }

    public Producto(String tipo, Integer cantidad, Integer precioUnidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Integer precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    @Override
    public String toString() {
        return "Producto" + "\n" +
                "Tipo: " + tipo +
                " - Cantidad:" + cantidad +
                " - PrecioUnidad:" + precioUnidad;
    }
}
