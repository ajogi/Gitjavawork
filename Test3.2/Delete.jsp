<!DOCTYPE html>
<html>
<head>
<style>
@import url("mystyles.css");
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">
		<font color="red">${key}</font>
	</h1>
	<form action="delete.cs">
		<table align="center">
			<tr>
				<td>empId</td>
				<td><input type="text" name="empID"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Delete"></td>
			</tr>



		</table>
	</form>
</body>
</html>
