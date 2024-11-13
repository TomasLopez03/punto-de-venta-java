
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static String url = "jdbc:mysql://localhost:3306/servicomprasdb";
    public static String username = "root";
    public static String password = "Luci2357";
    
    Connection connection;
    public Connection getConnection(){
        
        try{
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("conexion exitosa");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
