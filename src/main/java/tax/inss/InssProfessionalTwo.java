package tax.inss;

import models.EmployeeSalary;
import models.EmployeePosition;

import java.math.BigDecimal;

public class InssProfessionalTwo extends Inss {

    public InssProfessionalTwo(Inss nextTax) {
        super(nextTax);
    }

    public BigDecimal calculateInss(EmployeeSalary employeeSalary) {
        if (employeeSalary.getEmployeePosition().equals(EmployeePosition.PROFESSIONAL_TWO)) {
            return employeeSalary.getBaseSalary().multiply(new BigDecimal("0.12"));
        }
        return nextTax.calculateInss(employeeSalary);
    }
}
