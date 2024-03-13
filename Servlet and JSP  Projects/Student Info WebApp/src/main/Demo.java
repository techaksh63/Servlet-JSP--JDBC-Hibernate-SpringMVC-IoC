package main;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;


public class Demo extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        PrintWriter out = response.getWriter();
        out.println(request.getParameter("name"));


    }


}
