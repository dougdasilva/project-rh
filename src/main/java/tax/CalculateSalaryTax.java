package tax;

import models.Employee;

import java.math.BigDecimal;

public class CalculateSalaryTax {

    public BigDecimal calculate(Employee employee, SalaryTax tax) {
        return tax.calculateTax(employee);
    }
}
