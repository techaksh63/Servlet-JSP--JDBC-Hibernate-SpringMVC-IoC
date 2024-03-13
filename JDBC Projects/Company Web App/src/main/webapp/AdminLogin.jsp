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
<body>

<form action="Main" method= "post">
    <div class="container">

        <button type="submit">Submit</button>

    </div>
</form>

</body>
</html>
