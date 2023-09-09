package tax.inss;

import models.EmployeeSalary;

import java.math.BigDecimal;

public abstract class Inss {

    protected Inss nextTax;

    public Inss(Inss nextTax) {
        this.nextTax = nextTax;
    }

    protected abstract BigDecimal calculateInss(EmployeeSalary employeeSalary);

}
