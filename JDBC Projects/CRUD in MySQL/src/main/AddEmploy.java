package main;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

public class AddEmploy extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        ArrayList<Data> listData=(ArrayList<Data>)sc.getAttribute("E");

        for(int i=0 ;i<listData.size();i++){
            listData.add(new Data(request.getParameter("Name"),request.getParameter("Email"),request.getParameter("Department"),request.getParameter("Salary")));
            break;
        }



        response.sendRedirect("Home.jsp");
    }
}
