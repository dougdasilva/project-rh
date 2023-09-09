package tax.fgts;

import models.EmployeePosition;
import models.EmployeeSalary;

import java.math.BigDecimal;

public class FgtsProfessionalEmployee extends Fgts {

    public FgtsProfessionalEmployee(Fgts nextTax) {
        super(nextTax);
    }

    @Override
    protected BigDecimal calculateFgts(EmployeeSalary employeeSalary) {
        if (employeeSalary.getEmployeePosition().equals(EmployeePosition.PROFESSIONAL_ONE)
                || employeeSalary.getEmployeePosition().equals(EmployeePosition.PROFESSIONAL_TWO)
                || employeeSalary.getEmployeePosition().equals(EmployeePosition.PROFESSIONAL_THREE)) {
            return employeeSalary.getBaseSalary().multiply(new BigDecimal("0.08"));
        }
        return nextTax.calculateFgts(employeeSalary);
    }
}
