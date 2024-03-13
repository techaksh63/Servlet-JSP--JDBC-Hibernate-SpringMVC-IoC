package main;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;


public class Demo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("name", request.getParameter("name"));
        session.setAttribute("password", request.getParameter("password"));

          response.sendRedirect("Profile.jsp");
    }
}
