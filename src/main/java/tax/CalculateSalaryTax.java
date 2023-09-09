package tax;

import models.EmployeeSalary;

import java.math.BigDecimal;

public class CalculateSalaryTax {

    public BigDecimal calculate(EmployeeSalary employeeSalary, SalaryTax tax) {
        return tax.calculateTax(employeeSalary);
    }
}
