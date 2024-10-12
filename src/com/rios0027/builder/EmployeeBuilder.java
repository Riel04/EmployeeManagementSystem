package com.rios0027.builder;

/**
 * Interface for building different parts of an employee.
 */
public interface EmployeeBuilder {
    EmployeeBuilder setName(String name);
    EmployeeBuilder setDepartment(String department);
    EmployeeBuilder setRole(String role);
    EmployeeBuilder setWorkingHoursPerWeek(int hours);
    EmployeeBuilder setSalary(double salary);
    com.rios0027.employee.Employee build();
}