package benefit;

import models.EmployeeSalary;

import java.math.BigDecimal;

public class CalculateBenefit {

    public BigDecimal calculate(EmployeeSalary employeeSalary, AddBenefit benefit) {
        return benefit.calculate(employeeSalary);
    }
}
