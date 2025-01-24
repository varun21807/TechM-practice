package com.assessment3.app;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 
 */
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private LocalDate joiningDate;
/**
 * 
 * @param id
 * @param name
 * @param department
 * @param salary
 * @param joiningDate
 */
    // Constructor
    public Employee(int id, String name, String department, double salary, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }
/**
 * 
 * @return
 */
    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{" +"id=" + id +", name='" + name + '\'' +", department='" + department + '\'' +
                ", salary=" + salary +", joiningDate=" + joiningDate +'}';
    }
}

public class EmployeeManagementSystem {
/**
 * 
 * @param args
 */
    public static void main(String[] args) {
        // Sample Employee List
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Varun", "HR", 65000, LocalDate.of(2018, Month.MAY, 20)),
                new Employee(2, "Dhanush", "IT", 85000, LocalDate.of(2020, Month.JANUARY, 15)),
                new Employee(3, "Gokul", "Finance", 90000, LocalDate.of(2022, Month.JANUARY, 5)),
                new Employee(4, "Gobi", "IT", 40000, LocalDate.of(2029, Month.JANUARY, 8)),
                new Employee(5, "Kamal", "HR", 70000, LocalDate.of(2017, Month.FEBRUARY, 15))
        );

        // Identify employees who have a work anniversary this month
        identifyWorkAnniversaries(employees);

        // Count the number of employees in each department
        countEmployeesByDepartment(employees);
    }
/**
 * 
 * @param employees
 */
    // Method to identify employees with work anniversaries this month
    private static void identifyWorkAnniversaries(List<Employee> employees) {
        int currentMonth = LocalDate.now().getMonthValue();

        List<Employee> anniversaries = employees.stream()
                .filter(emp -> emp.getJoiningDate().getMonthValue() == currentMonth)
                .collect(Collectors.toList());

        System.out.println("Employees with Work Anniversaries this Month:");
        anniversaries.forEach(System.out::println);
    }

    // Method to count employees in each department
    /**
     * 
     * @param employees
     */
    private static void countEmployeesByDepartment(List<Employee> employees) {
        Map<String, Long> departmentCounts = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("\nNumber of Employees in Each Department:");
        departmentCounts.forEach((department, count) -> 
                System.out.println(department + ": " + count));
    }
}

