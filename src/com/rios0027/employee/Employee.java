package com.rios0027.employee;

/**
 * Abstract class representing a generic employee in the system.
 * This class serves as a blueprint for different types of employees.
 */
public abstract class Employee {
    protected int id;
    protected String name;
    protected String department;
    protected String role;
    protected int workingHoursPerWeek;
    protected double salary;

    /**
     * Constructs an Employee object with specified details.
     *
     * @param id The unique identifier for the employee.
     * @param name The name of the employee.
     * @param department The department of the employee.
     * @param role The job title of the employee.
     * @param workingHoursPerWeek The weekly working hours.
     * @param salary The salary of the employee.
     */
    public Employee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void clockIn();
    public abstract void clockOut();
    public abstract void trackWorkHours();

    // Getters and Setters

    /**
     * Gets the unique identifier for the employee.
     *
     * @return The employee's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the employee.
     *
     * @param id The unique identifier to set.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the employee.
     *
     * @return The employee's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     *
     * @param name The name to set for the employee.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the department of the employee.
     *
     * @return The employee's department.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the employee.
     *
     * @param department The department to set for the employee.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets the role of the employee.
     *
     * @return The employee's role.
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the role of the employee.
     *
     * @param role The role to set for the employee.
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets the working hours per week for the employee.
     *
     * @return The number of working hours per week.
     */
    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    /**
     * Sets the working hours per week for the employee.
     *
     * @param workingHoursPerWeek The number of working hours to set per week.
     */
    public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    /**
     * Gets the salary of the employee.
     *
     * @return The employee's salary.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary The salary to set for the employee.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Returns a string representation of the Employee object.
     *
     * @return A string containing the employee's details.
     */
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' +
                ", role='" + role + '\'' + ", workingHoursPerWeek=" + workingHoursPerWeek + ", salary=" + salary + '}';
    }
}