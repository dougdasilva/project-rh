package org.example;

import models.EmployeePosition;
import models.EmployeeSalary;
import tax.fgts.CalculateFgts;
import tax.inss.CalculateInss;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test");

        EmployeeSalary employeeSalary = new EmployeeSalary(new BigDecimal("1000"), EmployeePosition.PROFESSIONAL_THREE);
        CalculateFgts taxFgts = new CalculateFgts();
        BigDecimal fgtsDiscount = taxFgts.calculateFgts(employeeSalary).setScale(2);

        CalculateInss calculateInss = new CalculateInss();
        BigDecimal inssDiscount = calculateInss.calculateInss(employeeSalary).setScale(2);

        BigDecimal netSalary = employeeSalary.getBaseSalary().subtract(fgtsDiscount).subtract(inssDiscount).setScale(2);

        System.out.println("**********  **********  **********");
        System.out.println("Nível do cargo: " + employeeSalary.getEmployeePosition().toString());
        System.out.println("Desconto do FGTS: R$ " + fgtsDiscount);
        System.out.println("Desconto do INSS: R$ " + inssDiscount);
        System.out.println("Salário bruto: R$ " + employeeSalary.getBaseSalary());
        System.out.println("Salário líquido: R$ " + netSalary);
        System.out.println("Data da admissão: " + employeeSalary.getCreatedEmployee());
        System.out.println("**********  **********  **********");

    }
}