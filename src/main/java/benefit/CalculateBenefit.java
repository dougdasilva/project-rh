package benefit;

import models.EmployeeCheck;

import java.math.BigDecimal;

public class CalculateBenefit {

    public BigDecimal calculate(EmployeeCheck employeeCheck, AddBenefit benefit) {
        return benefit.calculate(employeeCheck);
    }
}
