<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
@import url("mystyles.css");
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td><a href="viewAll.cs">Display All</a></td>
		</tr>

		<tr>
			<td><a href="FindEmp.jsp">View My Data </a></td>
		</tr>
		<tr>
			<td><a href="Delete.jsp">Delete Employee</a> <font color="red">${deleteKey}</font></td>
		</tr>


	</table>
</body>
</html>
