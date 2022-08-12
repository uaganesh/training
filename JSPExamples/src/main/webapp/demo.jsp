<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to HTML WEBPAGE</h2>
<%
out.println("Welcome to JSP");
int a=10;
int b=20;
out.println("sum="+(a+b));
%>
<p>SUm of numbers =<%=2+3 %></p>
</body>
</html>