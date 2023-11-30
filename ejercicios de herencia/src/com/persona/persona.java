package com.persona;

public class persona {
    private String nombre;
    private int edad;
    private int telefono;

    public persona() {
    }

    public persona(String nombre, int edad, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public String toStringpersona() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                '}';
    }
}
