package main;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AddEmploy extends HttpServlet {
    static int count =6;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();

        for(int i=count ;i<20;i++){
            sc.setAttribute("EmpName"+count, request.getParameter("Name"));
            sc.setAttribute("EmpEmail"+count, request.getParameter("Email"));
            sc.setAttribute("EmpDepartment"+count, request.getParameter("Department"));
            sc.setAttribute("EmpSalary"+count, request.getParameter("Salary"));
            count++;
            break;
        }



        response.sendRedirect("Home.jsp");
    }
}
