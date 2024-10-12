package com.rios0027.employee;

/**
 * Class representing a part-time employee.
 */
public class PartTimeEmployee extends Employee {

    /**
     * Constructs a PartTimeEmployee object with specified details.
     *
     * @param id The unique identifier for the employee.
     * @param name The name of the employee.
     * @param department The department of the employee.
     * @param role The job title of the employee.
     * @param workingHoursPerWeek The weekly working hours.
     * @param salary The salary of the employee.
     */
    public PartTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    /**
     * Clock in for the part-time employee.
     * This implementation logs that the employee has clocked in.
     */
    @Override
    public void clockIn() {
        System.out.println(name + " clocked in as a part-time employee.");
    }

    /**
     * Clock out for the part-time employee.
     * This implementation logs that the employee has clocked out.
     */
    @Override
    public void clockOut() {
        System.out.println(name + " clocked out as a part-time employee.");
    }

    /**
     * Track work hours for the part-time employee.
     * This implementation logs that the employee is tracking their work hours.
     */
    @Override
    public void trackWorkHours() {
        System.out.println(name + " is tracking work hours.");
    }
}