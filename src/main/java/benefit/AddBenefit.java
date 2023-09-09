package benefit;

import models.EmployeeCheck;

import java.math.BigDecimal;

public interface AddBenefit {

    BigDecimal calculate(EmployeeCheck employeeCheck);
}
