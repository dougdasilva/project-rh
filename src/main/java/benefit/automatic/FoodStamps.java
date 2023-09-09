package benefit.automatic;

import benefit.AddBenefit;
import models.EmployeeSalary;

import java.math.BigDecimal;

public class FoodStamps implements AddBenefit {
    @Override
    public BigDecimal calculate(EmployeeSalary employeeSalary) {
        return new BigDecimal("400");
    }
}
