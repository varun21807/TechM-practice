package com.streams1.app;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Employee {
    String name;
    String department;
    double salary;
    
public Employee(String name,String department,double salary) {
	this.name=name;
	this.department=department;
	this.salary=salary;
}
public String getdepatment() {
	return department;
}
public double getsalary() {
	return salary;
}


public static void main(String args[]) {
	List<Employee> employee = Arrays.asList(
			new Employee("Alice", "HR", 45000),
			new Employee("Bob", "Engineering", 75000),
			new Employee("Charlie", "Engineering", 60000),
			new Employee("David", "Sales", 50000),
			new Employee("Eve", "HR", 65000));
	
	Entry<String, Double> max_salary=employee.stream().filter(a->a.salary>=50000)
	.collect(Collectors.groupingBy(Employee::getdepatment,Collectors.summingDouble(Employee::getsalary)))
	.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
	System.out.println("Department with the highest total salary:"+max_salary.getKey()+" and "+max_salary.getValue());
	
}

}
