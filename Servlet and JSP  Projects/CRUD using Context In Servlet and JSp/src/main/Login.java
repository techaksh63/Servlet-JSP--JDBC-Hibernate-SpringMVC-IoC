package main;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Login extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        List<Data> listData = new ArrayList<>();
        listData.add(new Data("Aksh", "akshdarji2019@gmail.com", "Java", "6000"));
        listData.add(new Data("Parth", "parth32@gmail.com", "PowerBI", "7000"));
        listData.add(new Data("Yash", "yashpanchal23@gmail.com", "ReactNative", "8000"));
        listData.add(new Data("Darshan", "darshan87@gmail.com", "MERN", "9000"));

        ServletContext sc = getServletContext();

        for(int i=0;i<listData.size();i++){
            sc.setAttribute("EmpName"+i, listData.get(i).getEName());
            sc.setAttribute("EmpEmail"+i, listData.get(i).getEmail());
            sc.setAttribute("EmpDepartment"+i, listData.get(i).getDepartment());
            sc.setAttribute("EmpSalary"+i, listData.get(i).getSalary());
        }


        if (session.getAttribute("name").equals(request.getParameter("name")) && session.getAttribute("password").equals(request.getParameter("password"))){
             response.sendRedirect("Home.jsp");
        }
        else {
             response.sendRedirect("Error.jsp");
        }

    }

}

class Data{
    private String EName;
    private String Email;
    private String Department;
    private String Salary;

    public Data(String EName, String email, String department, String salary) {
        this.EName = EName;
        Email = email;
        Department = department;
        Salary = salary;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return  "EName='" + EName + '\'' +
                ", Email='" + Email + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary='" + Salary + '\'' ;
    }
}