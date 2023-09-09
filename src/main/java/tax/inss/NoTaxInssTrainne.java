package tax.inss;

import models.EmployeeSalary;

import java.math.BigDecimal;

public class NoTaxInssTrainne extends Inss {
    public NoTaxInssTrainne() {
        super(null);
    }

    @Override
    protected BigDecimal calculateInss(EmployeeSalary employeeSalary) {
        return BigDecimal.ZERO;
    }
}
