package com.rios0027.ems;

import com.rios0027.employee.FullTimeEmployee;
import com.rios0027.employee.PartTimeEmployee;
import com.rios0027.manager.EmployeeManager;
import com.rios0027.employee.Employee;

/**
 * Main class to simulate the Employee Management System.
 * This class creates employee instances and manages them using EmployeeManager.
 */
public class EMS {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();  // Create an EmployeeManager instance

        // Creating and adding FullTimeEmployee instances
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee(1, "John Doe", "HR", "HR Manager", 40, 60000);
        employeeManager.addEmployee(fullTimeEmployee1);

        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee(2, "Jane Smith", "IT", "Developer", 40, 70000);
        employeeManager.addEmployee(fullTimeEmployee2);

        // Creating and adding PartTimeEmployee instances
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee(3, "Emily Johnson", "Marketing", "Intern", 20, 30000);
        employeeManager.addEmployee(partTimeEmployee1);

        // Retrieve and display all employees
        System.out.println("All Employees:");
        for (var employee : employeeManager.getAllEmployees()) {
            System.out.println(employee);
        }

        // Retrieve a specific employee by ID
        Employee retrievedEmployee = employeeManager.getEmployee(1);
        if (retrievedEmployee != null) {
            System.out.println("Retrieved Employee: " + retrievedEmployee);
        } else {
            System.out.println("Employee not found.");
        }
    }
}