package benefit.automatic;

import benefit.AddBenefit;
import models.EmployeeCheck;

import java.math.BigDecimal;

public class FoodStamps implements AddBenefit {
    @Override
    public BigDecimal calculate(EmployeeCheck employeeCheck) {
        return new BigDecimal("400");
    }
}
