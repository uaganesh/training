<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Welcome to Admin Portal ${sessionScope.obj}</h2> <!-- El Language JSTL -->
<%
String name=(String)session.getAttribute("obj");
out.println(name);
%>


<a href="AddTeacher.jsp">Add Teacher Details</a> |  <a href="ViewTeacherDetails">View Teacher Details</a> </br>
<a href="AddSudent.jsp">Add Student Details</a> |  <a href="ViewStudentDetails">View Student Details</a> </br>
<a href="AddClass.jsp">Add Class Details</a> | <a href="ViewClassDetails">View Class Details</a> </br>
<a href="AddSubject.jsp">Add Subject Details </a> |<a href="ViewSubjectDetails">View Subject Details</a> </br
</body>
</html>