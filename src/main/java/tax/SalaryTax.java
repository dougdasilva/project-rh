package tax;

import models.Employee;

import java.math.BigDecimal;

public interface SalaryTax {

    BigDecimal calculateTax(Employee employee);
}
