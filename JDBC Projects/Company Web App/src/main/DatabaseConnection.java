package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    Connection connection;
   public DatabaseConnection() throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.cj.jdbc.Driver");
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Aksh_Schema", "root","root");
   }
   public Connection StartConnection(){
       return connection;
   }

   public void CloseConnection() throws SQLException {
       connection.close();
   }

}
