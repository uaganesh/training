package com.main;

import java.util.List;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {
 public static void main(String[] args) {
	Employee emp1= new Employee();
	emp1.setId(16);
	emp1.setName("Ajay");
	emp1.setSalary(25000);
	
	EmployeeService es=new EmployeeService();
	String result=es.storeEmployee(emp1);
	System.out.println(result);
	
	 
/*	 EmployeeService es=new EmployeeService();
	 List<Employee> lisOfEmp=es.getAllEmployee();
	 
	 for(Employee emp:lisOfEmp)
	 {
		 System.out.println(emp);
	 }
	 */

 }
}

	
	
	

