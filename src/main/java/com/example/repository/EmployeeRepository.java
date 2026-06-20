package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
@Qualifier("empRepo")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
 List<Employee> findByDept(String dept);
 List<Employee> findBySalaryGreaterThan(double salary);
 
}
