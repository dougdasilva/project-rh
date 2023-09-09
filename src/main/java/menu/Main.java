package menu;

import benefit.CalculateBenefit;
import benefit.automatic.FoodStamps;
import benefit.automatic.TransportationVouchers;
import models.EmployeePosition;
import models.EmployeeSalary;
import tax.fgts.CalculateFgts;
import tax.inss.CalculateInss;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        EmployeeSalary employeeSalary = new EmployeeSalary(new BigDecimal("1000"), EmployeePosition.PROFESSIONAL_THREE);
        CalculateFgts taxFgts = new CalculateFgts();
        BigDecimal fgtsDiscount = taxFgts.calculateFgts(employeeSalary).setScale(2);

        CalculateInss calculateInss = new CalculateInss();
        BigDecimal inssDiscount = calculateInss.calculateInss(employeeSalary).setScale(2);

        CalculateBenefit benefit = new CalculateBenefit();
        BigDecimal benefitVoucher = benefit.calculate(employeeSalary, new TransportationVouchers());
        BigDecimal benefitStamps = benefit.calculate(employeeSalary, new FoodStamps());

        BigDecimal netSalary = employeeSalary.getBaseSalary().subtract(fgtsDiscount).subtract(inssDiscount).setScale(2);

        System.out.println("**********  **********  **********");
        System.out.println("Nível do cargo: " + employeeSalary.getEmployeePosition().toString());
        System.out.println("Desconto do FGTS: R$ " + fgtsDiscount);
        System.out.println("Desconto do INSS: R$ " + inssDiscount);
        System.out.println("Vale transporte: R$ " + benefitVoucher);
        System.out.println("Vale alimentação: R$ " + benefitStamps);
        System.out.println("Salário bruto: R$ " + employeeSalary.getBaseSalary());
        System.out.println("Salário líquido: R$ " + netSalary);
        System.out.println("Data da admissão: " + employeeSalary.getCreatedEmployee());
        System.out.println("**********  **********  **********");

    }
}