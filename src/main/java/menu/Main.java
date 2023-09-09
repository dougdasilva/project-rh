package menu;

import benefit.CalculateBenefit;
import benefit.automatic.FoodStamps;
import benefit.automatic.TransportationVouchers;
import models.EmployeeSeniority;
import models.EmployeeCheck;
import tax.fgts.CalculateFgts;
import tax.inss.CalculateInss;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        EmployeeCheck employeeCheck = new EmployeeCheck(new BigDecimal("1000"), EmployeeSeniority.PROFESSIONAL_THREE);
        CalculateFgts taxFgts = new CalculateFgts();
        BigDecimal fgtsDiscount = taxFgts.calculateFgts(employeeCheck).setScale(2);

        CalculateInss calculateInss = new CalculateInss();
        BigDecimal inssDiscount = calculateInss.calculateInss(employeeCheck).setScale(2);

        CalculateBenefit benefit = new CalculateBenefit();
        BigDecimal benefitVoucher = benefit.calculate(employeeCheck, new TransportationVouchers());
        BigDecimal benefitStamps = benefit.calculate(employeeCheck, new FoodStamps());

        BigDecimal netSalary = employeeCheck.getBaseSalary().subtract(fgtsDiscount).subtract(inssDiscount).setScale(2);

        System.out.println("**********  **********  **********");
        System.out.println("Nível do cargo: " + employeeCheck.getEmployeePosition().toString());
        System.out.println("Desconto do FGTS: R$ " + fgtsDiscount);
        System.out.println("Desconto do INSS: R$ " + inssDiscount);
        System.out.println("Vale transporte: R$ " + benefitVoucher);
        System.out.println("Vale alimentação: R$ " + benefitStamps);
        System.out.println("Salário bruto: R$ " + employeeCheck.getBaseSalary());
        System.out.println("Salário líquido: R$ " + netSalary);
        System.out.println("Data da admissão: " + employeeCheck.getCreatedEmployee());
        System.out.println("**********  **********  **********");

    }
}