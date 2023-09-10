package models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class EmployeeCheck {

    private String id;
    private LocalDateTime createdCheck;
    private BigDecimal baseSalary;
    private EmployeeSeniority employeeSeniority;
    private BigDecimal bonusValue;

    public EmployeeCheck(BigDecimal baseSalary, EmployeeSeniority employeeSeniority) {
        this.id = UUID.randomUUID().toString();
        this.createdCheck = LocalDateTime.now();
        this.baseSalary = baseSalary;
        this.employeeSeniority = employeeSeniority;
        this.bonusValue = BigDecimal.ZERO;
    }

    public BigDecimal getBonusValue() {
        return bonusValue;
    }

    public EmployeeSeniority getEmployeePosition() {
        return employeeSeniority;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public LocalDateTime getCreatedCheck() {
        return createdCheck;
    }
}
