package com.rios0027.manager;

import com.rios0027.employee.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Manager class for handling employee operations.
 * This class manages adding, retrieving, and searching for employees.
 */
public class EmployeeManager {
    private final List<Employee> employees;  // List to store all employees

    /**
     * Constructs an EmployeeManager instance with an empty employee list.
     */
    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    /**
     * Adds a new employee to the system.
     *
     * @param employee The employee to be added
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Retrieves the list of all employees.
     *
     * @return A list of all employees
     */
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param id The ID of the employee to find
     * @return The employee with the specified ID, or null if not found
     */
    public Employee getEmployee(int id) {
        return findEmployeeById(id);
    }

    /**
     * Finds an employee by their ID.
     *
     * @param id The ID of the employee to find
     * @return The employee with the specified ID, or null if not found
     */
    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;  // Employee not found
    }
}