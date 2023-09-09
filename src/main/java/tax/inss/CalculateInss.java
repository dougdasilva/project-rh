package tax.inss;

import models.EmployeeSalary;

import java.math.BigDecimal;

public class CalculateInss {

    public BigDecimal calculateInss(EmployeeSalary employeeSalary) {
        Inss inss = new InssAssistant(
                new InssProfessionalOne(
                        new InssProfessionalTwo(
                                new InssProfessionalThree(
                                        new NoTaxInssTrainne()
                                )
                        )
                )
        );
        return inss.calculateInss(employeeSalary);
    }
}
