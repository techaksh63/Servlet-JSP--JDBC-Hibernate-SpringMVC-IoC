package main;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Login extends HttpServlet {

    static List<Data> listData = new ArrayList<>();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        listData.add(new Data("Aksh", "akshdarji2019@gmail.com", "Java", "6000"));
        listData.add(new Data("Parth", "parth32@gmail.com", "PowerBI", "7000"));
        listData.add(new Data("Yash", "yashpanchal23@gmail.com", "ReactNative", "8000"));
        listData.add(new Data("Darshan", "darshan87@gmail.com", "MERN", "9000"));

        ServletContext sc = getServletContext();
        sc.setAttribute("E", listData);

        if (session.getAttribute("name").equals(request.getParameter("name")) && session.getAttribute("password").equals(request.getParameter("password"))){
             response.sendRedirect("Home.jsp");
        }
        else {
             response.sendRedirect("Error.jsp");
        }

    }

}

