package com.hcl.service;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Employee;

@RestController

public class EmployeeController {

@RequestMapping(value = "/getemployee/{empID}", method = RequestMethod.GET)

public Employee getEmployee(@PathVariable("empID") String empID) {

Employee e = Employee.getEmployee(empID);
return e;
}
}


