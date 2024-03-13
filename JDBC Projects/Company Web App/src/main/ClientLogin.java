package main;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        DatabaseConnection db = null;
        try {
            db = new DatabaseConnection();
            Connection connection = db.StartConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT Password FROM Aksh_Schema.Client where Email=(?);");
            ps.setString(1,request.getParameter("email"));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               if(rs.getString("password").equals(request.getParameter("password"))){
                   response.sendRedirect("ClientDashboard.jsp");
               }
               else {
                   System.out.println("failed to login");
               }
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
