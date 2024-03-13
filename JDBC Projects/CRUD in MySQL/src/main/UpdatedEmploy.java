package main;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

public class UpdatedEmploy extends HttpServlet {
    static int count =1;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        ArrayList<Data> listData=(ArrayList<Data>)sc.getAttribute("E");

        for(int i=0;i<listData.size();i++){
            if(request.getParameter("EnName").equals(listData.get(i).getEName())){
                listData.remove(i);
                listData.add(new Data(request.getParameter("UpName"),request.getParameter("UpEmail"),request.getParameter("UpDepartment"),request.getParameter("UpSalary")));
            }
            else{
                System.out.println("There is No such User to update");
            }
        }



        response.sendRedirect("Home.jsp");
    }
}
