package main;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;

public class Login extends HttpServlet {
    Datas2 datas2 = new Datas2();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        datas2.setNames(request.getParameter("name"));
        datas2.setPasswords(request.getParameter("password"));

        HttpSession session = request.getSession();

        Cookie c[] = request.getCookies();

//        String name = request.getParameter("name");
//        String password = request.getParameter("password");


//        if (c[1].getValue().equals(request.getParameter("name")) && c[2].getValue().equals(request.getParameter("password"))){
//             response.sendRedirect("Welcome.jsp");
//        }
//        else {
//             response.sendRedirect("Error.jsp");
//        }

        if (session.getAttribute("name").equals(request.getParameter("name")) && session.getAttribute("password").equals(request.getParameter("password"))){
             response.sendRedirect("Welcome.jsp");
        }
        else {
             response.sendRedirect("Error.jsp");
        }

    }
}
