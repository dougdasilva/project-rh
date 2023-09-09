package tax;

import models.EmployeeSalary;

import java.math.BigDecimal;

public interface SalaryTax {

    BigDecimal calculateTax(EmployeeSalary employeeSalary);
}
