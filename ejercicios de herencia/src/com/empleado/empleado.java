package com.empleado;
import  com.persona.persona;
public class empleado extends persona{

    String dni;
    int sueldo;

    public empleado(String dni, int sueldo) {
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public empleado(String nombre, int edad, int telefono, String dni, int sueldo) {
        super(nombre, edad, telefono);
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

@Override
    public String toString2() {
        return "empleado{" +
                "dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
