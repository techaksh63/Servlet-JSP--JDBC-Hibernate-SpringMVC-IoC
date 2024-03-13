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
      <%= "<h1> Welcome to jsp </h1>" %>
       <form action="studInfo.jsp" method="post" >
         Enter Students Name   : <input type="text" name="t1" />
         <br >
         <br >
         Enter Students RollNo : <input type="number" name="t2"  />
         <br>
         <br>
         Enter Students Address : <input type="text" name="t3" />
         <br>
         <br>
         Enter Password : <input type="password" name="t4" />
         <br>
         <br>
                  Enter Subject 1   : <input type="text" name="s1" />
                  <br >
                  <br >
                  Enter Subject 2 : <input type="text" name="s2" />
                  <br>
                  <br>
                  Enter Subject 3   : <input type="text" name="s3" />
                  <br >
                  <br >
                  Enter Subject 4  : <input type="text" name="s4" />
                  <br>
                  <br>
         <input type="submit" value="Submit" />
        </form>

    </body>

</html>