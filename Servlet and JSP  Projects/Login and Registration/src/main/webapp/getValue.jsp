<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="main.Datas" scope="application"></jsp:useBean>
<jsp:getProperty property="name" name="user" />
<jsp:getProperty property="password" name="user"/>

</body>
</html>