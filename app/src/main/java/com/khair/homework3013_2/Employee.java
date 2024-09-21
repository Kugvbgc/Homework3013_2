package com.khair.homework3013_2;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDate;


    // Constructor to initialize the Employee object
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now(); // Get the current date
        Period period = Period.between(hireDate, currentDate); // Calculate the difference
        return period.getYears(); // Return the number of years
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
}
