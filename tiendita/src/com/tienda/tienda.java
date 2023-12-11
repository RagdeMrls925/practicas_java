package com.tienda;

public class producto {
    int id_producto;
    String tipo_produto;
    String nombre_producto;
    double precio;

    public producto() {
        this(0, "","",0);
    }

    public producto(int id_producto, String tipo_produto, String nombre_producto, double precio) {
        this.id_producto = id_producto;
        this.tipo_produto = tipo_produto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getTipo_produto() {
        return tipo_produto;
    }

    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "tienda{" +
                "id_producto=" + id_producto +
                ", tipo_produto='" + tipo_produto + '\'' +
                ", nombre_producto='" + nombre_producto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
