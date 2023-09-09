package benefit.automatic;

import benefit.AddBenefit;
import models.EmployeeCheck;

import java.math.BigDecimal;

public class TransportationVouchers implements AddBenefit {
    @Override
    public BigDecimal calculate(EmployeeCheck employeeCheck) {
        return employeeCheck.getBonusValue().add(new BigDecimal("150"));
    }
}
