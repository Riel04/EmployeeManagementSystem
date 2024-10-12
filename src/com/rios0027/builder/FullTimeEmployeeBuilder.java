package com.rios0027.builder;

import com.rios0027.employee.FullTimeEmployee;

/**
 * Builder for constructing FullTimeEmployee objects.
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private int id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    /**
     * Sets the name of the employee.
     *
     * @param name The name of the employee.
     * @return The current instance of FullTimeEmployeeBuilder for method chaining.
     */
    @Override
    public FullTimeEmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sets the department of the employee.
     *
     * @param department The department of the employee.
     * @return The current instance of FullTimeEmployeeBuilder for method chaining.
     */
    @Override
    public FullTimeEmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Sets the role of the employee.
     *
     * @param role The role of the employee.
     * @return The current instance of FullTimeEmployeeBuilder for method chaining.
     */
    @Override
    public FullTimeEmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Sets the working hours per week of the employee.
     *
     * @param hours The number of working hours per week.
     * @return The current instance of FullTimeEmployeeBuilder for method chaining.
     */
    @Override
    public FullTimeEmployeeBuilder setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
        return this;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary The salary of the employee.
     * @return The current instance of FullTimeEmployeeBuilder for method chaining.
     */
    @Override
    public FullTimeEmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    /**
     * Builds and returns a FullTimeEmployee object with the specified properties.
     *
     * @return A FullTimeEmployee object.
     */
    @Override
    public FullTimeEmployee build() {
        return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}