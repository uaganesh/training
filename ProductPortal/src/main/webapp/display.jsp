<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Price</th>
<th>Quantity</th>
</tr>
<c:forEach var="listOfObj" items="${obj}" >
<tr>
<td>${listOfObj.id}</td>
<td>${listOfObj.name}</td>
<td>${listOfObj.price}</td>
<td>${listOfObj.quantity}</td>
</tr>
</c:forEach>
</table>
</body>
</html>