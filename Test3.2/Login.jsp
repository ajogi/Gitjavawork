<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

<style>
@import url("mystyles.css");

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script>
		var app = angular.module('myApp', []);
		app.controller('validateCtrl', function($scope) {
			$scope.empID = '001';
			$scope.mobile = '9876543210';

		});
	</script>
	<h1 align="center">
		<font color="red">${key}</font>
	</h1>

	<form action="login.cs" ng-app="myApp" ng-controller="validateCtrl"
		name="myForm" novalidate>
		<table align="center">
			<tr>
				<td>empId</td>
				<td><input type="text" ng-model="empID" name="empID" required>
					<span style="color: black"
					ng-show="myForm.empID.$dirty && myForm.empID.$invalid"> <span
						ng-show="myForm.empID.$error.required">EmpID is required.</span>
				</span></td>
			</tr>
			<tr>
				<td>MobileNo</td>
				<td><input type="text" name="mobile" ng-model="mobile" required>
					<span style="color: black"
					ng-show="myForm.mobile.$dirty && myForm.mobile.$invalid"> <span
						ng-show="myForm.mobile.$error.required">MObile no is
							required.</span>
				</span></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" style="bg-color: green" value="click"
					ng-disabled="myForm.empID.$dirty && myForm.empID.$invalid ||  
myForm.mobile.$dirty && myForm.mobile.$invalid"></td>
			</tr>



		</table>
	</form>
</body>
</html>
