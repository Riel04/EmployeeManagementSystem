package com.rios0027.builder;

import com.rios0027.employee.FullTimeEmployee;
import com.rios0027.employee.PartTimeEmployee;

/**
 * Class that directs the construction of Employee objects using the builder.
 */
public class EmployeeDirector {
    /**
     * Builds a FullTimeEmployee using the provided builder.
     *
     * @param builder The builder used to create the FullTimeEmployee
     * @return The constructed FullTimeEmployee object
     */
    public FullTimeEmployee buildFullTimeEmployee(FullTimeEmployeeBuilder builder) {
        return builder.build();
    }

    /**
     * Builds a PartTimeEmployee using the provided builder.
     *
     * @param builder The builder used to create the PartTimeEmployee
     * @return The constructed PartTimeEmployee object
     */
    public PartTimeEmployee buildPartTimeEmployee(PartTimeEmployeeBuilder builder) {
        return builder.build();
    }
}