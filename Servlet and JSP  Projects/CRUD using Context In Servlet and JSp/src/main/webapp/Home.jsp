<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
<h1> Welcome to the Home page!..</h1>
<h1> Employ Data</h1>
<%
    ServletContext sc = getServletContext();
%>
<h2>
<table border=1 id="table">
  <tr>
    <th>Name</th>
    <th>Email</th>
    <th>Department</th>
    <th>Salary</th>
  </tr>

  <% for(int j=0;j<10;j++){%>
          <% if (sc.getAttribute("EmpName"+j) != null) { %>
          <tr>
            <td><%out.println(sc.getAttribute("EmpName"+j));%></td>
            <td><%out.println(sc.getAttribute("EmpEmail"+j));%></td>
            <td><%out.println(sc.getAttribute("EmpDepartment"+j));%></td>
            <td><%out.println(sc.getAttribute("EmpSalary"+j));%></td>
          </tr> <%}%>
    <%}%>


</table>


<br><br>
<form action="DeleteEmploy" method= "post">
  <label for="fname">Delete Employ:</label><br>
  <input type="text" placeholder="Employ Name" name="EName" required><br>
  <input type="submit" value="Submit">
</form>


<br><br>
<form action="AddEmploy" method= "post">
  <label for="fname">Add Employ:</label><br>
  <input type="text" placeholder="Employ Name" name="Name" required><br>
  <input type="email" placeholder="Email" name="Email" required><br>
  <input type="text" placeholder="Department" name="Department" required><br>
  <input type="text" placeholder="Salary" name="Salary" required><br>
  <input type="submit" value="Submit">
</form>


<br><br>
<form action="UpdatedEmploy" method= "post">
  <label for="fname">Employ Name to Edit Details :</label><br>
  <input type="text" placeholder="Employ Name" name="EnName" required><br>
  <label for="fname">Updated Details :</label><br>
  <input type="text" placeholder="Updated Name" name="UpName" required><br>
  <input type="email" placeholder="Updated Email" name="UpEmail" required><br>
  <input type="text" placeholder="Updated Department" name="UpDepartment" required><br>
  <input type="text" placeholder="Updated Salary" name="UpSalary" required><br>
  <input type="submit" value="Submit">
</form>




</h2>
</body>
</html>