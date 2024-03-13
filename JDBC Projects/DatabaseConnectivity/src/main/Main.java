package main;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Main extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        PrintWriter out = response.getWriter();
        out.println("hello friends");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Aksh_Schema", "root","root");
            PreparedStatement ps = con.prepareStatement("INSERT INTO `Aksh_Schema`.`EmployeeTable` (`EmployeeID`, `EmployeeName`, `EmployeeDepartment`) VALUES ('2', 'Aksh', 'Python');");
//            ps.setInt(1,1);
//            ps.setString(2,"Aksh");
//            ps.setString(3,"Python");
//            int i = ps.executeUpdate();

            PreparedStatement ps1 = con.prepareStatement("UPDATE `Aksh_Schema`.`EmployeeTable` SET `EmployeeName` = 'Vinit ', `EmployeeDepartment` = 'PowerBI' WHERE (`EmployeeID` = '2');");
//            int i = ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement("SELECT * FROM Aksh_Schema.EmployeeTable;");
            ResultSet rs = ps2.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("EmployeeID"));
                System.out.println(rs.getString("EmployeeName"));
                System.out.println(rs.getString("EmployeeDepartment"));
            }

//            if (i>0){
//                System.out.println("success");
//            }
//            else{
//                System.out.println("Failed");
//            }

            System.out.println("Last Statement in the Try Block");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
