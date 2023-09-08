package tax;

import models.Employee;

import java.math.BigDecimal;

public class Fgts implements SalaryTax {
    public BigDecimal calculateTax(Employee employee) {
        switch (employee.getEmployeePosition()) {
            case ASSISTANT:
                return employee.getBaseSalary().multiply(new BigDecimal("0.02"));
            case PROFESSIONAL_ONE:
            case PROFESSIONAL_TWO:
            case PROFESSIONAL_THREE:
                return employee.getBaseSalary().multiply(new BigDecimal("0.08"));
            case TRAINEE:
                return BigDecimal.ZERO;
            default:
                break;
        }
        return new BigDecimal("");
    }
}
