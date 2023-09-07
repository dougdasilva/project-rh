package models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Employee {

    private String id;
    private LocalDate createdEmployee;
    private BigDecimal baseSalary;

    public Employee(BigDecimal baseSalary) {
        this.id = UUID.randomUUID().toString();
        this.createdEmployee = LocalDate.now();
        this.baseSalary = baseSalary;
    }

}
