package main;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientRegister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DatabaseConnection db = null;
        try {
            PrintWriter out = response.getWriter();
            db = new DatabaseConnection();
            Connection connection = db.StartConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO `Aksh_Schema`.`Client` (`Name`, `Email`, `Password`, `Contact`, `Gender`) VALUES (?,?,?,?,?);");
            ps.setString(1,request.getParameter("name"));
            ps.setString(2,request.getParameter("email"));
            ps.setString(3,request.getParameter("password"));
            ps.setString(4,request.getParameter("mobile"));
            ps.setString(5,request.getParameter("gender"));
            int i = ps.executeUpdate();

            if (i>0){
                out.println("<script> alert(\"Login successful!\");</script>");
            }
            else{
                out.println("<script> alert(\"Login Failed!\");</script>");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        response.sendRedirect("index.jsp");
    }
}
