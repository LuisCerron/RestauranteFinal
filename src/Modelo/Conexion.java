package Modelo;
//Hola Mundo---------------------------------------
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;
    /*Codigo para la conexion para la base de datos */
    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://localhost:3306/restaurante";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}