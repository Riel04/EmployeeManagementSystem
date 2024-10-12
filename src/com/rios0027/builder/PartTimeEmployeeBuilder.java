package com.rios0027.builder;

import com.rios0027.employee.PartTimeEmployee;

/**
 * Builder for constructing PartTimeEmployee objects.
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {
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
     * @return The current instance of PartTimeEmployeeBuilder for method chaining.
     */
    @Override
    public PartTimeEmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sets the department of the employee.
     *
     * @param department The department of the employee.
     * @return The current instance of PartTimeEmployeeBuilder for method chaining.
     */
    @Override
    public PartTimeEmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Sets the role of the employee.
     *
     * @param role The role of the employee.
     * @return The current instance of PartTimeEmployeeBuilder for method chaining.
     */
    @Override
    public PartTimeEmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Sets the working hours per week of the employee.
     *
     * @param hours The number of working hours per week.
     * @return The current instance of PartTimeEmployeeBuilder for method chaining.
     */
    @Override
    public PartTimeEmployeeBuilder setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
        return this;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary The salary of the employee.
     * @return The current instance of PartTimeEmployeeBuilder for method chaining.
     */
    @Override
    public PartTimeEmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    /**
     * Builds and returns a PartTimeEmployee object with the specified properties.
     *
     * @return A PartTimeEmployee object.
     */
    @Override
    public PartTimeEmployee build() {
        return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}