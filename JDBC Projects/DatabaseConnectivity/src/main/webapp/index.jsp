<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="main.DatabaseConnection"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Login Page </title>
    <style>
        Body {
          background-color: lightgray;
        }
        button {
               background-color: #4CAF50;
                width: 10%;
                color: red;
                padding: 15px;
                margin: 10px 0px;
                border: none;
                cursor: pointer;
                 }

         button:hover {
                opacity: 0.7;
            }

    </style>
</head>
<body>
<%
   DatabaseConnection db = new DatabaseConnection();
   Connection connection = db.ConnectionStart();
   PrintWriter out1 = response.getWriter();
   PreparedStatement allData = connection.prepareStatement("SELECT * FROM Aksh_Schema.EmployeeTable;");
   ResultSet rs = allData.executeQuery();
   rs.next();
%>
<h1> Database </h1>

<table>
  <tr>
    <td>Emil</td>
    <td>Tobias</td>
    <td>Linus</td>
  </tr>
    <%while(rs.next()){%>
  <tr>
    <td><%out1.print(rs.getInt("EmployeeID"));%></td>
    <td>14</td>
    <td>10</td>
  </tr>
    <%}%>
</table>

<table>
  <tr>
    <th>EmployeeID</th>
    <th>EmployeeName</th>
    <th>EmployeeDepartment</th>
  </tr>

  <%while(rs.next()){%>
  <tr>
    <td><%out1.print(rs.getInt("EmployeeID"));%></td>
    <td><%out1.print(rs.getString("EmployeeName"));%></td>
  </tr>
  <%}%>
  <tr>
    <td>16</td>
    <td>14</td>
    <td>10</td>
  </tr>
</table>

    <form action="Main" method= "post">
        <div class="container">

            <button type="submit">Submit</button>

        </div>
    </form>

</body>
</html>