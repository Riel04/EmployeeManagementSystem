package com.rios0027.test;

import com.rios0027.factory.EmployeeFactory;
import com.rios0027.employee.Employee;
import com.rios0027.employee.FullTimeEmployee;
import com.rios0027.employee.PartTimeEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for the EmployeeFactory class.
 */
class EmployeeFactoryTest {
    private final EmployeeFactory employeeFactory = new EmployeeFactory();

    /**
     * Tests creating a FullTimeEmployee.
     */
    @Test
    void testCreateFullTimeEmployee() {
        Employee employee = employeeFactory.createFullTimeEmployee(1, "John Doe", "Engineering", "Software Engineer", 40, 80000);
        assertTrue(employee instanceof FullTimeEmployee);
        assertEquals("John Doe", employee.getName());
        assertEquals(1, employee.getId());
    }

    /**
     * Tests creating a PartTimeEmployee.
     */
    @Test
    void testCreatePartTimeEmployee() {
        Employee employee = employeeFactory.createPartTimeEmployee(2, "Jane Smith", "Marketing", "Marketing Assistant", 20, 40000);
        assertTrue(employee instanceof PartTimeEmployee);
        assertEquals("Jane Smith", employee.getName());
        assertEquals(2, employee.getId());
    }
}