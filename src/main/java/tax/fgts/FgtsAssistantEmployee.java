package tax.fgts;

import models.EmployeePosition;
import models.EmployeeSalary;

import java.math.BigDecimal;

public class FgtsAssistantEmployee extends Fgts {

    public FgtsAssistantEmployee(Fgts nextTax) {
        super(nextTax);
    }

    @Override
    protected BigDecimal calculateFgts(EmployeeSalary employeeSalary) {
        if (employeeSalary.getEmployeePosition().equals(EmployeePosition.ASSISTANT)) {
            return employeeSalary.getBaseSalary().multiply(new BigDecimal("0.02"));
        }

        return nextTax.calculateFgts(employeeSalary);
    }
}
