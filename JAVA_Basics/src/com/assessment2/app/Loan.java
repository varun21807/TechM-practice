package com.assessment2.app;

public class Loan {
    
    // Method to calculate loan amount based on the employee type
    public double calculateLoanAmount(Employee employee) {
        double loanAmount = 0;
        

        // Determine the employee type and calculate the loan amount accordingly
        if (employee instanceof PermanentEmployee) {
            loanAmount = employee.getSalary() * 0.15; // 15% of salary for PermanentEmployee
        } else if (employee instanceof TemporaryEmployee) {
            loanAmount = employee.getSalary() * 0.10; // 10% of salary for TemporaryEmployee
        }
        
        return loanAmount;
       
    }


}


    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    