<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String emailid,password; %>
<%
emailid=request.getParameter("email");
password=request.getParameter("password");
RequestDispatcher rd1 =request.getRequestDispatcher("home.jsp");
RequestDispatcher rd2 =request.getRequestDispatcher("login.jsp");

if(emailid.equals("u@gmail.com")&&password.equals("1234"))
{
	out.println("Successfully logged in ");
	rd1.forward(request, response);
}else
{
	out.println("Failed");
	rd2.include(request, response);
}




%>
</body>
</html>