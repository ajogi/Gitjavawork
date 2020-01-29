<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>

<script
src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<body>

<div ng-app="EmpApp" ng-controller="EmpController">

Emp ID: <input type="text" ng-model="emp.empID">

<button ng-click="getEmp()"> Search </button> <br/>

Name: {{emp.empName}} <br/>

Designation: {{emp.desig}} <br/>

City: {{emp.city}} <br/>

</div>

<script>
var app = angular.module('EmpApp', []);

app.controller('EmpController', function($scope,$http) {

$scope.emp = [];

$scope.getEmp = function() {

$http({

method : 'GET',

url : 'getemployee/' + $scope.emp.empID

}).then(function successCallback(response) {

$scope.emp = response.data;

// alert(response.data);

}, function errorCallback(response) {

alert("Data Error");

console.log(response.statusText);

});

};

});

</script>

</body>

</html>