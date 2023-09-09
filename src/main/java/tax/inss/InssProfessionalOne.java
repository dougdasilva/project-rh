package tax.inss;

import models.EmployeeSalary;
import models.EmployeePosition;

import java.math.BigDecimal;

public class InssProfessionalOne extends Inss {

    public InssProfessionalOne(Inss nextTax) {
        super(nextTax);
    }

    public BigDecimal calculateInss(EmployeeSalary employeeSalary) {
        if (employeeSalary.getEmployeePosition().equals(EmployeePosition.PROFESSIONAL_ONE)) {
            return employeeSalary.getBaseSalary().multiply(new BigDecimal("0.09"));
        }
        return nextTax.calculateInss(employeeSalary);
    }
}
