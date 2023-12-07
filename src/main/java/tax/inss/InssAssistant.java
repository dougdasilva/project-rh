package tax.inss;

import models.EmployeeCheck;
import models.EmployeeSeniority;

import java.math.BigDecimal;

public class InssAssistant extends Inss {

    public InssAssistant(Inss nextTax) {
        super(nextTax);
    }

    @Override
    public BigDecimal calculateInss(EmployeeCheck employeeCheck) {
        if (employeeCheck.getEmployeeSeniority().equals(EmployeeSeniority.ASSISTANT)) {
            return employeeCheck.getBaseSalary().multiply(new BigDecimal("0.075"));
        }
        return nextTax.calculateInss(employeeCheck);
    }
}
