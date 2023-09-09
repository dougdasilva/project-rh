package tax.inss;

import models.EmployeeSalary;
import models.EmployeePosition;

import java.math.BigDecimal;

public class InssProfessionalThree extends Inss {

    public InssProfessionalThree(Inss nextTax) {
        super(nextTax);
    }

    public BigDecimal calculateInss(EmployeeSalary employeeSalary) {
        if ((employeeSalary.getEmployeePosition().equals(EmployeePosition.PROFESSIONAL_THREE))) {
            return employeeSalary.getBaseSalary().multiply(new BigDecimal("0.14"));
        }
        return nextTax.calculateInss(employeeSalary);
    }
}