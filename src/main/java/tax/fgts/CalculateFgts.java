package tax.fgts;

import models.EmployeeSalary;

import java.math.BigDecimal;

public class CalculateFgts {

    public BigDecimal calculateFgts(EmployeeSalary employeeSalary) {
        Fgts fgts = new FgtsProfessionalEmployee(
                new FgtsAssistantEmployee(
                        new NoTaxFgtsTrainne()
                )
        );
        return fgts.calculateFgts(employeeSalary);
    }

}
