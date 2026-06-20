package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
@Qualifier("empRepo")
private EmployeeRepository empRepo;

@Override
public Employee insert(Employee emp) {
	
	return empRepo.save(emp);
}

@Override
public Employee search(int id) {
	Employee e=empRepo.findById(id).orElse(null);
	return e;
}

@Override
public void delete(int id) {
	empRepo.deleteById(id);
	
}

@Override
public Employee update(Employee emp) {
	Employee eold=empRepo.findById(emp.getId()).orElse(null);
	if(eold!=null) {
		eold.setName(emp.getName());
		eold.setDept(emp.getDept());
		eold.setSalary(emp.getSalary());
		return empRepo.save(eold);
	}
	return null;
}

@Override
public List<Employee> getAll() {
	return empRepo.findAll();
	
}

@Override
public List<Employee> getAllByDept(String dept) {
	
	return empRepo.findByDept(dept);
}

@Override
public List<Employee> getAllBySalary(double salary) {
	
	return empRepo.findBySalaryGreaterThan(salary);
}



}
