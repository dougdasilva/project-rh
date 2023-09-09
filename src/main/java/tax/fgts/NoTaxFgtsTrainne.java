package tax.fgts;

import models.EmployeeSalary;

import java.math.BigDecimal;

public class NoTaxFgtsTrainne extends Fgts {
    public NoTaxFgtsTrainne() {
        super(null);
    }

    @Override
    protected BigDecimal calculateFgts(EmployeeSalary employeeSalary) {
        return BigDecimal.ZERO;
    }
}
