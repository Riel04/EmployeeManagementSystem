package com.rios0027.test;

import com.rios0027.builder.EmployeeDirector;
import com.rios0027.builder.FullTimeEmployeeBuilder;
import com.rios0027.builder.PartTimeEmployeeBuilder;
import com.rios0027.employee.FullTimeEmployee;
import com.rios0027.employee.PartTimeEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for the EmployeeDirector class.
 */
class EmployeeDirectorTest {
    private final EmployeeDirector employeeDirector = new EmployeeDirector();

    /**
     * Tests the construction of a FullTimeEmployee.
     */
    @Test
    void testBuildFullTimeEmployee() {
        FullTimeEmployeeBuilder builder = new FullTimeEmployeeBuilder();
        FullTimeEmployee employee = employeeDirector.buildFullTimeEmployee(builder
                .setName("John Doe")
                .setDepartment("Engineering")
                .setRole("Software Engineer")
                .setWorkingHoursPerWeek(40)
                .setSalary(80000));

        assertNotNull(employee);
        assertEquals("John Doe", employee.getName());
        assertEquals("Engineering", employee.getDepartment());
        assertEquals("Software Engineer", employee.getRole());
        assertEquals(40, employee.getWorkingHoursPerWeek());
        assertEquals(80000, employee.getSalary(), 0.001);
    }

    /**
     * Tests the construction of a PartTimeEmployee.
     */
    @Test
    void testBuildPartTimeEmployee() {
        PartTimeEmployeeBuilder builder = new PartTimeEmployeeBuilder();
        PartTimeEmployee employee = employeeDirector.buildPartTimeEmployee(builder
                .setName("Jane Smith")
                .setDepartment("Marketing")
                .setRole("Marketing Assistant")
                .setWorkingHoursPerWeek(20)
                .setSalary(40000));

        assertNotNull(employee);
        assertEquals("Jane Smith", employee.getName());
        assertEquals("Marketing", employee.getDepartment());
        assertEquals("Marketing Assistant", employee.getRole());
        assertEquals(20, employee.getWorkingHoursPerWeek());
        assertEquals(40000, employee.getSalary(), 0.001);
    }
}