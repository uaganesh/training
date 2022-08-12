<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
<h1>Enter the product details...</h1>
<form action="AddProduct" method="post">
<table>
<tr>
<td>Product ID:</td>
<td><input type="text" name="id"/></td>
</tr>
<tr>
<td>Product Name:</td>
<td><input type="text" name="name" id="name"
maxlength=40/></td>
</tr>
<tr>
<td>Price:</td>
<td><input type="text" name="price" id="price"/></td>
</tr>
<tr>
<td>Quantity:</td>
<td><input type="text" name="quantity"/></td>
</tr>
<tr>
<td />
<td><input type="submit" value="Add product" /></td>
</tr>
</table>
</form>
</body>
</html>