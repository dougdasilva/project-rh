package tax.fgts;

import models.EmployeeCheck;

import java.math.BigDecimal;

public class NoTaxFgtsTrainne extends Fgts {
    public NoTaxFgtsTrainne() {
        super(null);
    }

    @Override
    protected BigDecimal calculateFgts(EmployeeCheck employeeCheck) {
        return BigDecimal.ZERO;
    }
}
