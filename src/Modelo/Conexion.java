package Modelo;
//que tal
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    Connection con;
    /*Codigo para la conexion para la base de datos */
    public Connection getConnection() throws ClassNotFoundException{
        try {
            Class.forName("org.h2.Driver");
            String myBD = "jdbc:h2:file:./database/restaurante";
            con = DriverManager.getConnection(myBD, "admin", "");
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,(e.toString()));
        }
        return null;
    }
}