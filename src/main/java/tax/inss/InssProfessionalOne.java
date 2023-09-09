package tax.inss;

import models.EmployeeCheck;
import models.EmployeeSeniority;

import java.math.BigDecimal;

public class InssProfessionalOne extends Inss {

    public InssProfessionalOne(Inss nextTax) {
        super(nextTax);
    }

    public BigDecimal calculateInss(EmployeeCheck employeeCheck) {
        if (employeeCheck.getEmployeePosition().equals(EmployeeSeniority.PROFESSIONAL_ONE)) {
            return employeeCheck.getBaseSalary().multiply(new BigDecimal("0.09"));
        }
        return nextTax.calculateInss(employeeCheck);
    }
}
