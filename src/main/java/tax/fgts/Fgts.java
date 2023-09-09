package tax.fgts;

import models.EmployeeSalary;

import java.math.BigDecimal;

public abstract class Fgts {

    protected Fgts nextTax;

    public Fgts(Fgts nextTax) {
        this.nextTax = nextTax;
    }

    protected abstract BigDecimal calculateFgts(EmployeeSalary employeeSalary);

}
