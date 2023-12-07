package tax.fgts;

import models.EmployeeSeniority;
import models.EmployeeCheck;

import java.math.BigDecimal;

public class FgtsProfessionalEmployee extends Fgts {

    public FgtsProfessionalEmployee(Fgts nextTax) {
        super(nextTax);
    }

    @Override
    protected BigDecimal calculateFgts(EmployeeCheck employeeCheck) {
        if (employeeCheck.getEmployeeSeniority().equals(EmployeeSeniority.PROFESSIONAL_ONE)
                || employeeCheck.getEmployeeSeniority().equals(EmployeeSeniority.PROFESSIONAL_TWO)
                || employeeCheck.getEmployeeSeniority().equals(EmployeeSeniority.PROFESSIONAL_THREE)) {
            return employeeCheck.getBaseSalary().multiply(new BigDecimal("0.08"));
        }
        return nextTax.calculateFgts(employeeCheck);
    }
}
