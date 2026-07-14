import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException {
        try {
            // Gantilah db_kemahasiswaan dengan nama database Anda di phpMyAdmin
            String url = "jdbc:mysql://localhost:3306/db_kemahasiswaan"; 
            String user = "root"; 
            String pass = ""; 
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
        return mysqlconfig;
    }
}