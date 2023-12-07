package tax.inss;

import models.EmployeeCheck;
import models.EmployeeSeniority;

import java.math.BigDecimal;

public class InssProfessionalThree extends Inss {

    public InssProfessionalThree(Inss nextTax) {
        super(nextTax);
    }

    public BigDecimal calculateInss(EmployeeCheck employeeCheck) {
        if ((employeeCheck.getEmployeeSeniority().equals(EmployeeSeniority.PROFESSIONAL_THREE))) {
            return employeeCheck.getBaseSalary().multiply(new BigDecimal("0.14"));
        }
        return nextTax.calculateInss(employeeCheck);
    }
}