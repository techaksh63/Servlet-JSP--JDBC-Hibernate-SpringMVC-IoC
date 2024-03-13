<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Student Information </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>

 <body>

    <%! int rollNo; %>
    <%! String name, address, password; %>
    <%! String sub1,sub2,sub3,sub4; %>

    <%
        name=request.getParameter("t1");
        rollNo=Integer.parseInt(request.getParameter("t2"));
        address=request.getParameter("t3");
        password=request.getParameter("t4");
        out.println("<h2>Given Student Information <br> Name : "+name+" <br> RollNo : "+rollNo+"<br> Address : "+address);
    %>
    <%
       sub1=request.getParameter("s1");
       sub2=request.getParameter("s2");
       sub3=request.getParameter("s3");
       sub4=request.getParameter("s4");
    %>

    <%
        String name=request.getParameter("t1");
        session.setAttribute("name",name);
        session.setAttribute("password",password);
    %>
    <%
     ServletContext sc= getServletContext();
     sc.setAttribute("sub1",sub1);
     sc.setAttribute("sub2",sub2);
     sc.setAttribute("sub3",sub3);
     sc.setAttribute("sub4",sub4);
    %>

    <jsp:useBean id="stud" class="main.student" />
    <br> <h1> Student's information from Bean </h1>
        <h2>
         Roll Name :
         <jsp:setProperty name="stud" property="name" value="<%=name %>" />
         <jsp:getProperty name="stud" property="name" />
        <br> RollNo:
        <jsp:setProperty name="stud" property="rollNo" value="<%=rollNo %>" />
        <jsp:getProperty name="stud" property="rollNo" />
        <br> Address is:
        <jsp:setProperty name="stud" property="address" value="<%=address %>" />
        <jsp:getProperty name="stud" property="address" />
        <jsp:setProperty name="stud" property="password" value="<%=password %>" />
        <jsp:setProperty name="stud" property="sub1" value="<%=sub1 %>" />

        </h2>
        <br>
        <br>
        <a href="login.jsp" >Click Here! to Login</a>

 </body>
</html>
