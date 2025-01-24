package com.assessment2.app;

public class Main {
    public static void main(String[] args) {
        // Create and initialize a PermanentEmployee and a TemporaryEmployee
        PermanentEmployee permEmp = new PermanentEmployee(200, "Luffy", 30000.0);
        permEmp.calculateSalary(); // Calculate salary for PermanentEmployee
        
        TemporaryEmployee tempEmp = new TemporaryEmployee(190, "Zoro", 220, 50);
        tempEmp.calculateSalary(); // Calculate salary for TemporaryEmployee

        // Instantiate the Loan class
        Loan loan = new Loan();

        // Calculate loan amounts
        double permEmpLoan = loan.calculateLoanAmount(permEmp);
        double tempEmpLoan = loan.calculateLoanAmount(tempEmp);

        // Print the calculated loan amounts
        System.out.println("Permanent Employee Loan Amount: " + permEmpLoan);
        System.out.println("Temporary Employee Loan Amount: " + tempEmpLoan);
    }
}
    
