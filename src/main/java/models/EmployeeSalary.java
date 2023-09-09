package models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class EmployeeSalary {

    private String id;
    private LocalDateTime createdEmployee;
    private BigDecimal baseSalary;
    private EmployeePosition employeePosition;

    public EmployeeSalary(BigDecimal baseSalary, EmployeePosition employeePosition) {
        this.id = UUID.randomUUID().toString();
        this.createdEmployee = LocalDateTime.now();
        this.baseSalary = baseSalary;
        this.employeePosition = employeePosition;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public LocalDateTime getCreatedEmployee() {
        return createdEmployee;
    }
}
