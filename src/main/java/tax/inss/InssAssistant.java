package tax.inss;

import models.EmployeeSalary;
import models.EmployeePosition;

import java.math.BigDecimal;

public class InssAssistant extends Inss {

    public InssAssistant(Inss nextTax) {
        super(nextTax);
    }

    @Override
    public BigDecimal calculateInss(EmployeeSalary employeeSalary) {
        if (employeeSalary.getEmployeePosition().equals(EmployeePosition.ASSISTANT)) {
            return employeeSalary.getBaseSalary().multiply(new BigDecimal("0.075"));
        }
        return nextTax.calculateInss(employeeSalary);
    }
}
