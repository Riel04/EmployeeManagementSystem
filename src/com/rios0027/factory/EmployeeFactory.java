package com.rios0027.factory;

import com.rios0027.employee.FullTimeEmployee;
import com.rios0027.employee.PartTimeEmployee;
import com.rios0027.employee.Employee;

/**
 * Factory class to create different types of employees.
 */
public class EmployeeFactory {

    /**
     * Creates a full-time employee.
     * 
     * @param id The unique identifier for the employee
     * @param name The name of the employee
     * @param department The department of the employee
     * @param role The job title of the employee
     * @param workingHoursPerWeek The weekly working hours
     * @param salary The salary of the employee
     * @return A new instance of FullTimeEmployee
     */
    public Employee createFullTimeEmployee(int id, String name, String department, String role,
                                            int workingHoursPerWeek, double salary) {
        return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }

    /**
     * Creates a part-time employee.
     * 
     * @param id The unique identifier for the employee
     * @param name The name of the employee
     * @param department The department of the employee
     * @param role The job title of the employee
     * @param workingHoursPerWeek The weekly working hours
     * @param salary The salary of the employee
     * @return A new instance of PartTimeEmployee
     */
    public Employee createPartTimeEmployee(int id, String name, String department, String role,
                                            int workingHoursPerWeek, double salary) {
        return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}