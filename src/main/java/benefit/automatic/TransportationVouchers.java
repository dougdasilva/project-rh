package benefit.automatic;

import benefit.AddBenefit;
import models.EmployeeSalary;

import java.math.BigDecimal;

public class TransportationVouchers implements AddBenefit {
    @Override
    public BigDecimal calculate(EmployeeSalary employeeSalary) {
        return employeeSalary.getBonusValue().add(new BigDecimal("150"));
    }
}
