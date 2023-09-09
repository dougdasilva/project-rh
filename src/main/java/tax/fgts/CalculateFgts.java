package tax.fgts;

import models.EmployeeCheck;

import java.math.BigDecimal;

public class CalculateFgts {

    public BigDecimal calculateFgts(EmployeeCheck employeeCheck) {
        Fgts fgts = new FgtsProfessionalEmployee(
                new FgtsAssistantEmployee(
                        new NoTaxFgtsTrainne()
                )
        );
        return fgts.calculateFgts(employeeCheck);
    }

}
