package tax.inss;

import models.EmployeeCheck;
import models.EmployeeSeniority;

import java.math.BigDecimal;

public class InssProfessionalTwo extends Inss {

    public InssProfessionalTwo(Inss nextTax) {
        super(nextTax);
    }

    public BigDecimal calculateInss(EmployeeCheck employeeCheck) {
        if (employeeCheck.getEmployeeSeniority().equals(EmployeeSeniority.PROFESSIONAL_TWO)) {
            return employeeCheck.getBaseSalary().multiply(new BigDecimal("0.12"));
        }
        return nextTax.calculateInss(employeeCheck);
    }
}
