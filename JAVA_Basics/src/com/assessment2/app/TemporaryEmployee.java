package com.assessment2.app;

public class TemporaryEmployee extends Employee {
    // Attributes
    private int hoursWorked;
    private int hourlyWages;

    // Constructor
    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName); // Call the constructor of the base Employee class
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    // Getter and Setter for hoursWorked
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Getter and Setter for hourlyWages
    public int getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }

    // Implement the calculateSalary method

    public void calculateSalary() {
        // Calculate the salary based on hours worked and hourly wages
        double computedSalary = hoursWorked * hourlyWages;
        setSalary(computedSalary); // Set the computed salary using the base class's method
    }
}

