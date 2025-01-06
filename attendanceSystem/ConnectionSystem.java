package attendanceSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class ConnectionSystem {
	public static void main(String[] args) {
		
        String connectionUrl = "jdbc:sqlserver://PKLAHLHM33;databaseName=AttendanceSystem;integratedSecurity=true;trustServerCertificate=true;";
        try(Connection connection = DriverManager.getConnection(connectionUrl)) {
            System.out.println("Connected successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
}
