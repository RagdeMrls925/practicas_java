package com.auto;

public class auto {
    String marca;
    String modelo;
    double precio;
    String color;
    int n_puertas;

    public auto() {
        this("", "", 0, "", 0);

    }

    public auto(String marca, String modelo, double precio, String color, int n_puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.n_puertas = n_puertas;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getN_puertas() {
        return n_puertas;
    }

    public void setN_puertas(int n_puertas) {
        this.n_puertas = n_puertas;
    }

    @Override
    public String toString() {
        return "auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", n_puertas=" + n_puertas +
                '}';
    }
}
