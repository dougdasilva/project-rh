package tax.inss;

import models.EmployeeCheck;

import java.math.BigDecimal;

public class NoTaxInssTrainne extends Inss {
    public NoTaxInssTrainne() {
        super(null);
    }

    @Override
    protected BigDecimal calculateInss(EmployeeCheck employeeCheck) {
        return BigDecimal.ZERO;
    }
}
