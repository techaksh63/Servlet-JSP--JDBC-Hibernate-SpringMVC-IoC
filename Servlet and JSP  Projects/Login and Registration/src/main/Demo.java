package main;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;


public class Demo extends HttpServlet {
       Datas datas = new Datas();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Cookie c1 = new Cookie("name",request.getParameter("name"));
        Cookie c2 = new Cookie("password",request.getParameter("password"));
         response.addCookie(c1);
         response.addCookie(c2);

        PrintWriter out = response.getWriter();
        out.println(request.getParameter("name"));

        datas.setName(request.getParameter("name"));
        datas.setEmail(request.getParameter("email"));
        datas.setPassword(request.getParameter("password"));

        session.setAttribute("name", request.getParameter("name"));
        session.setAttribute("password", request.getParameter("password"));


//          String name = request.getParameter("name");
//          String email = request.getParameter("email");
//          String password = request.getParameter("password");

          response.sendRedirect("Profile.jsp");


    }


}
