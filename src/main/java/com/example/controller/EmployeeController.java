package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@Controller
public class EmployeeController {
@Autowired
private EmployeeService empservice;

@RequestMapping("/")
private String home() {
	return "index";
}

@RequestMapping("/addemp")
private String addemp(Model m) {
	Employee emp=new Employee();
	m.addAttribute("emp",emp);
	return "addempform";//jsp page
	
}
@RequestMapping("/saveemp")
private String saveemp(@ModelAttribute("emp")Employee e){
	empservice.insert(e);
	return "index";
	
}
@RequestMapping("/viewemps")
public String viewemps(Model m)
{
List<Employee> ls=empservice.getAll();
m.addAttribute("list",ls);
return "viewemps";
}
@RequestMapping("/delemployee")
public String delemployee(@RequestParam("rn")int rn) {
	empservice.delete(rn);
	return "index";
	
}
@RequestMapping("/upemployee")
public String upemployee(@RequestParam("rn")int rn,Model m) {
	 Employee emp=empservice.search(rn);
	 m.addAttribute("emp",emp);
	 return "upempform";
	
}
@RequestMapping("/updateemprecord")
public String updateemprecord(@ModelAttribute("emp")Employee emp) {
	empservice.update(emp);
	return "index";
	
}
@RequestMapping("/viewempsdept")
public String viewempsdept(Model m)
{
  List<Employee> ls=empservice.getAllByDept("sales");
  m.addAttribute("list",ls);
  return "viewemps";
}
@RequestMapping("/viewempssal")
public String viewempssal(Model m)
{
  List<Employee> ls=empservice.getAllBySalary(10000);
  m.addAttribute("list",ls);
  return "viewemps";
}
}
