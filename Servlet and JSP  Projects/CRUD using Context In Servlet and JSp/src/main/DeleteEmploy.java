package main;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DeleteEmploy extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();


        for(int i=0;i<20;i++){
            if(request.getParameter("EName").equals(sc.getAttribute("EmpName"+i))){
                sc.removeAttribute("EmpName"+i);
                sc.removeAttribute("EmpEmail"+i);
                sc.removeAttribute("EmpDepartment"+i);
                sc.removeAttribute("EmpSalary"+i);
            }
            else {
                System.out.println("There is No such Employ to Delete");
            }
        }


        response.sendRedirect("Home.jsp");
    }
}
