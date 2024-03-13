<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
<h1> Welcome to the Home page!..</h1>
<h1> Your User Name and Password is Correct. </h1>


 <%
String name=(String)session.getAttribute("sub1");
out.print(name);
 %>
</body>
</html>