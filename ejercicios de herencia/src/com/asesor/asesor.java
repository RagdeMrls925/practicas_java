package com.asesor;

import com.persona.persona;

public class asesor extends persona {

    int costo_hora = 150;

    int id;
    String empresa;
    int horas_trabajadas;
    int sueldo;

    public asesor() {
    }

    public asesor(String nombre, int edad, int telefono, int id, String empresa, int horas_trabajadas) {
        super(nombre, edad, telefono);
        this.id = id;
        this.empresa = empresa;
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public void asignarsueldo(){
        this.sueldo = horas_trabajadas * costo_hora;

    }
    public String toStringasesor() {
        return "asesor{" +
                "id=" + id +
                ", empresa='" + empresa + '\'' +
                ", horas_trabajadas=" + horas_trabajadas +
                '}';
    }
    public String detallesase(){
        return  "Datos asesor { " + "Nombre: " + getNombre() + " Edad: " + getEdad() + " Telefono: " + getTelefono() + " Id: " + getId() + " Sueldo: " + sueldo;
}
}
