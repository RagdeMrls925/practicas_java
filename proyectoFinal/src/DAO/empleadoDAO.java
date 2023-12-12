package DAO;
import conexionDB.conexion;
import modelos.empleado;

//Clases para guardar los datos de una consulta y guardar cambios en la base de datos
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Clases para obtener los datos de una tabla de una base de datos
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class empleadoDAO {

    conexion conexion;

    public empleadoDAO(conexion conexion){
        this.conexion = conexion;
    }

    public boolean RegistrarEmpleado(empleado empleado){
        String consulta = "INSERT INTO EMPLEADO VALUES(?,?,?,?,?,?,?);";

        try {
            PreparedStatement query = conexion.conectar().prepareStatement(consulta);
            query.setInt(1,empleado.getId_empleado());
            query.setString(2,empleado.getNombre_empleado());
            query.setString(3, empleado.getApellidos());
            query.setString(4,empleado.getTelefono());
            query.setString(5,empleado.getPuesto());
            query.setFloat(6,empleado.getSueldo());
            query.setString(7,empleado.getTipo_empleado());
            query.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    //el metodo mostrarempleados debe regresar una lista de empleados con todos sus datos
    public List<empleado> mostrar_empleados(){

        String consulta = "SELECT * FROM EMPLEADO";

        try {
            PreparedStatement query = conexion.conectar().prepareCall(consulta);
            ResultSet resultSet = query. executeQuery();

            List<empleado> empleadoList = new LinkedList<>();
            empleado empleado;

            while (resultSet.next()){
                empleado = new empleado();
                empleado.setNombre_empleado(resultSet.getString("nombre_empleado"));
                empleado.setApellidos(resultSet.getString("apellidos"));
                empleado.setTelefono(resultSet.getString("telefono"));
                empleado.setPuesto(resultSet.getString("puesto"));
                empleado.setSueldo(resultSet.getFloat("sueldo"));
                empleado.setTipo_empleado(resultSet.getString("tipo_empleado"));

                empleadoList.add(empleado);
            }

            return empleadoList;

        } catch (SQLException e) {
            return null;
        }

    }


}

