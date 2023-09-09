package tax.fgts;

import models.EmployeeSeniority;
import models.EmployeeCheck;

import java.math.BigDecimal;

public class FgtsAssistantEmployee extends Fgts {

    public FgtsAssistantEmployee(Fgts nextTax) {
        super(nextTax);
    }

    @Override
    protected BigDecimal calculateFgts(EmployeeCheck employeeCheck) {
        if (employeeCheck.getEmployeePosition().equals(EmployeeSeniority.ASSISTANT)) {
            return employeeCheck.getBaseSalary().multiply(new BigDecimal("0.02"));
        }

        return nextTax.calculateFgts(employeeCheck);
    }
}
