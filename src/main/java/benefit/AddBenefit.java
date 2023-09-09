package benefit;

import models.EmployeeSalary;

import java.math.BigDecimal;

public interface AddBenefit {

    BigDecimal calculate(EmployeeSalary employeeSalary);
}
