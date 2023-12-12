package modelos;

public class producto {
    int id_producto;
    String nombre_producto;
    float costo;
    String descripcion;

    public producto(int id_producto, String nombre_producto, float costo, String descripcion) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.costo = costo;
        this.descripcion = descripcion;
    }

    public producto() {

    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}