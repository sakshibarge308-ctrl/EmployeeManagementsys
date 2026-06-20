package com.example.service;

import java.util.List;


import com.example.model.Employee;

public interface EmployeeService {
	Employee insert(Employee emp);
	Employee search(int id);
	void delete(int id);
	Employee update(Employee emp);
	List<Employee>getAll();
	List<Employee> getAllByDept(String dept);
	List<Employee> getAllBySalary(double salary);

}
