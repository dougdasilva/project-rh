package tax;

import models.Employee;

import java.math.BigDecimal;

public class Inss implements SalaryTax {

    public BigDecimal calculateTax(Employee employee) {
        switch (employee.getEmployeePosition()) {
            case ASSISTANT:
                return employee.getBaseSalary().multiply(new BigDecimal("0.075"));
            case PROFESSIONAL_ONE:
                return employee.getBaseSalary().multiply(new BigDecimal("0.09"));
            case PROFESSIONAL_TWO:
                return employee.getBaseSalary().multiply(new BigDecimal("0.12"));
            case PROFESSIONAL_THREE:
                return employee.getBaseSalary().multiply(new BigDecimal("0.14"));
            default:
                return BigDecimal.ZERO;
        }

    }
}
