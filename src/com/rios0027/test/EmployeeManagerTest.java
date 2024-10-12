package com.rios0027.test;

import com.rios0027.employee.FullTimeEmployee;
import com.rios0027.employee.PartTimeEmployee;
import com.rios0027.manager.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for the EmployeeManager class.
 */
class EmployeeManagerTest {
    private EmployeeManager employeeManager;

    @BeforeEach
    void setUp() {
        employeeManager = new EmployeeManager();
    }

    /**
     * Tests adding a FullTimeEmployee.
     */
    @Test
    void testAddEmployee() {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "John Doe", "Engineering", "Software Engineer", 40, 80000);
        employeeManager.addEmployee(fullTimeEmployee);
        assertEquals(1, employeeManager.getAllEmployees().size());
    }

    /**
     * Tests finding an employee by ID.
     */
    @Test
    void testFindEmployeeById() {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Jane Smith", "Marketing", "Marketing Assistant", 20, 40000);
        employeeManager.addEmployee(partTimeEmployee);
        assertEquals(partTimeEmployee, employeeManager.findEmployeeById(2));
    }

    /**
     * Tests retrieving all employees.
     */
    @Test
    void testGetAllEmployees() {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "John Doe", "Engineering", "Software Engineer", 40, 80000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Jane Smith", "Marketing", "Marketing Assistant", 20, 40000);
        employeeManager.addEmployee(fullTimeEmployee);
        employeeManager.addEmployee(partTimeEmployee);
        
        assertEquals(2, employeeManager.getAllEmployees().size());
    }
}
