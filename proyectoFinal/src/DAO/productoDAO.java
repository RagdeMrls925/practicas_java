package DAO;
import conexionDB.conexion;
import modelos.empleado;
import modelos.producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class productoDAO {

    conexion conexion;

    public productoDAO(conexion conexion){
        this.conexion = conexion;
    }

    public boolean RegistrarProducto(producto producto){
        String consulta = "INSERT INTO PRODUCTO VALUES(?,?,?,?);";

        try {
            PreparedStatement query = conexion.conectar().prepareStatement(consulta);
            query.setInt(1,producto.getId_producto());
            query.setString(2,producto.getNombre_producto());
            query.setFloat(3,producto.getCosto());
            query.setString(4,producto.getDescripcion());
            query.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    //el metodo mostrarempleados debe regresar una lista de empleados con todos sus datos
    public List<producto> mostrar_producto(){

        String consulta = "SELECT * FROM PRODUCTO";

        try {
            PreparedStatement query = conexion.conectar().prepareCall(consulta);
            ResultSet resultSet = query. executeQuery();

            List<producto> productoList = new LinkedList<>();
            producto producto;

            while (resultSet.next()){
                producto = new producto();
                producto.setNombre_producto(resultSet.getString("nombre_producto"));
                producto.setCosto(resultSet.getFloat("costo"));
                producto.setDescripcion(resultSet.getString("descripcion"));


                productoList.add(producto);
            }

            return productoList;

        } catch (SQLException e) {
            return null;
        }

    }
}