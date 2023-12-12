package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;

public class conexion {
    //constantes de la base de datos
    static String username = "root";
    static String password = "Edgarmrls925";
    static String database = "TIENDA";
    static String port = "3306";
    static String hostname = "localhost";
    static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    Connection connection = null;

    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("CONEXION EXITOSA");
            }
        } catch (Exception e) {
            System.out.println("HUBO UN ERROR EN LA CONEXION" + e);
        }
    }

    public Connection conectar(){
        return connection;
    }

    public void desconectar() throws Exception{

        connection.close();


    }

}


