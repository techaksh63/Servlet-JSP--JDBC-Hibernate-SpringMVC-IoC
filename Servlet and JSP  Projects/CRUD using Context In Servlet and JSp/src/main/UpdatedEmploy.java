package main;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UpdatedEmploy extends HttpServlet {
    static int count =1;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();

        for(int i=0;i<20;i++){
            if(request.getParameter("EnName").equals(sc.getAttribute("EmpName"+i))){
                sc.removeAttribute("EmpName"+i);
                sc.setAttribute("EmpName"+i, request.getParameter("UpName"));
                sc.removeAttribute("EmpEmail"+i);
                sc.setAttribute("EmpEmail"+i, request.getParameter("UpEmail"));
                sc.removeAttribute("EmpDepartment"+i);
                sc.setAttribute("EmpDepartment"+i, request.getParameter("UpDepartment"));
                sc.removeAttribute("EmpSalary"+i);
                sc.setAttribute("EmpSalary"+i, request.getParameter("UpSalary"));
            }
            else{
                System.out.println("There is No such User to update");
            }
        }



        response.sendRedirect("Home.jsp");
    }
}
