<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="main.DatabaseConnection"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>
<%
   DatabaseConnection db = new DatabaseConnection();
   Connection connection = db.StartConnection();
   PrintWriter out1 = response.getWriter();
   PreparedStatement allData = connection.prepareStatement("SELECT * FROM Aksh_Schema.EmployeeTable;");
   ResultSet rs = allData.executeQuery();
%>
<html>
<style>
a:link, a:visited {
  margin-top: 10px;
  margin-right: 10px;
  background-color: lightgreen;
  color: black;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: green;
}
</style>
<body>
<h1> Hire Developer </h1>
<table border=1>
<tr>
<th>EmployeeID</th>
<th>EmployeeName</th>
<th>EmployeeDepartment</th>
<th>EmployeeExperience</th>
</tr>
<%while(rs.next()){%>
<tr>
<td><%=rs.getInt("EmployeeID")%></td>
<td><%=rs.getString("EmployeeName")%></td>
<td><%=rs.getString("EmployeeDepartment")%></td>
<td><%=rs.getString("EmployeeExperience")%></td>
</tr>
<%}%>
</table>
<a href="UpdateClientProfile.jsp">Update Profile</a>
<a href="">History</a>
<a href="">Hire</a>
</body>
</html>
