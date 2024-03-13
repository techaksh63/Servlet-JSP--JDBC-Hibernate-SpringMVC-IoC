package main;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session1 = request.getSession();
        PrintWriter out =response.getWriter();
        ServletContext sc = getServletContext();
        out.println(sc.getAttribute("sub1"));
//        out.println(request.getParameter("k1"));
//        out.println(request.getParameter("k2"));
//
//        out.println(session1.getAttribute("name"));
//        out.println(session1.getAttribute("password"));
//        session1.getAttribute("name");
//        session1.getAttribute("password");

        if (session1.getAttribute("name").equals(request.getParameter("k1")) && session1.getAttribute("password").equals(request.getParameter("k2"))){
            response.sendRedirect("Welcome.jsp");
        }
        else {
            response.sendRedirect("Error.jsp");
        }




    }


}
