<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Search</title>
</head>
<body>
Emp ID: <input type='text' id='empID'/>
<input type='button' value='get' onclick='getEmployee();'/> <br/>
Name: <input type='text' id='empName' disabled/> <br/>
Designation: <input type='text' id='desig' disabled/> <br/>
City: <input type='text' id='city' disabled/> <br/>
<script>
function getEmployee() {
var empID = document.getElementById("empID").value
var xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    var emp = JSON.parse(this.responseText);
    document.getElementById("empName").value = emp.empName;
    document.getElementById("desig").value = emp.desig;
    document.getElementById("city").value = emp.city;
    }
  };
  xhttp.open("GET", "getemployee/" + empID , true);
  xhttp.send();
}
</script>

</body>
</html>
