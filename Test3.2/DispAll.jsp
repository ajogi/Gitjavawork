<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sd"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
@import url("mystyles.css");
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<h1 align="center">Trainers Info</h1>
	<table>

		<tr bgcolor="tomato">
			<td bgcolor="tomato">EmpID</td>
			<td bgcolor="tomato">EmpName</td>
			<td bgcolor="tomato">Salary</td>
			<td bgcolor="tomato">DOJ</td>
			<td bgcolor="tomato">MobileNo</td>
		</tr>
		<sd:forEach var="emp" items="${key}">
			<tr>
				<td>${emp.empId}</td>
				<td>${emp.empName}</td>
				<td>${emp.empSal}</td>
				<td>${emp.doj}</td>
				<td>${emp.mobile}</td>
			</tr>
		</sd:forEach>

	</table>
	<div id="trainer_data"></div>
</body>
</html>
