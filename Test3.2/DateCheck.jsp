<!DOCTYPE html>
<html>
<head>
<style>
.submit {
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',
		endColorstr='#188BC0', GradientType=0);
	padding: 3px 5px;
	color: #fff;
	font-family: 'Helvetica Neue', sans-serif;
	font-size: 12px;
	border-radius: 10px;
	-moz-border-radius: 2px;
	-webkit-border-radius: 4px;
	border: 1px solid #1A87B9
}

table {
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	width: 50%;
}

tr {
	background: SteelBlue;
	color: white;
}

td, tr {
	border: 1px solid gray;
	width: 25%;
	text-align: left;
	padding: 5px 10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="date.cs">
		<table align="center">
			
			<tr>
				<td>Dob</td>
				<td><input type="date" name="doj"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Search"></td>
			</tr>



		</table>
	</form>
</body>
</html>
