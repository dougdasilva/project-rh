package tax.inss;

import models.EmployeeCheck;

import java.math.BigDecimal;

public class CalculateInss {

    public BigDecimal calculateInss(EmployeeCheck employeeCheck) {
        Inss inss = new InssAssistant(
                new InssProfessionalOne(
                        new InssProfessionalTwo(
                                new InssProfessionalThree(
                                        new NoTaxInssTrainne()
                                )
                        )
                )
        );
        return inss.calculateInss(employeeCheck);
    }
}
