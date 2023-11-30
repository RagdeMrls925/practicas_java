package com.empleado;
import  com.persona.persona;
public class empleado extends persona{

    String dni;
    int sueldo;

    String puesto;
    String departamento;

    //agregar al metodo constructor los atributos creados


    public empleado() {

    }

    public empleado(String nombre, int edad, int telefono, String dni, int sueldo, String puesto, String departamento) {
        super(nombre, edad, telefono);
        this.dni = dni;
        this.sueldo = sueldo;
        this.puesto = puesto;
        this.departamento = departamento;
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


    public String toStringempleado() {
        return "empleado{" +
                "dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
