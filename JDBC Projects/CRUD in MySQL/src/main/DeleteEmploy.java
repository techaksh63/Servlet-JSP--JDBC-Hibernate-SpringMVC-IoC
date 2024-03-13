package main;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

public class DeleteEmploy extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        ArrayList<Data> listData=(ArrayList<Data>)sc.getAttribute("E");

        for(int i=0;i<listData.size();i++){
            if(request.getParameter("EName").equals(listData.get(i).getEName())){
                listData.remove(i);
            }
            else {
                System.out.println("There is No such Employ to Delete");
            }
        }


        response.sendRedirect("Home.jsp");
    }
}
