package org.example;

import models.Employee;
import models.EmployeePosition;
import tax.CalculateSalaryTax;
import tax.Fgts;
import tax.Inss;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test");

        Employee employee = new Employee(new BigDecimal("3552"), EmployeePosition.PROFESSIONAL_TWO);
        CalculateSalaryTax taxFgts = new CalculateSalaryTax();
        BigDecimal fgtsDiscount = taxFgts.calculate(employee, new Fgts());

        CalculateSalaryTax taxInss = new CalculateSalaryTax();
        BigDecimal inssDiscount = taxInss.calculate(employee, new Inss());
        BigDecimal netSalary = employee.getBaseSalary().subtract(fgtsDiscount).subtract(inssDiscount);

        System.out.println("**********  **********  **********");
        System.out.println("Nível do cargo: " + employee.getEmployeePosition().toString());
        System.out.println("Desconto do FGTS: R$ " + fgtsDiscount);
        System.out.println("Desconto do INSS: R$ " + inssDiscount);
        System.out.println("Salário bruto: R$ " + employee.getBaseSalary());
        System.out.println("Salário líquido: R$ " + netSalary);
        System.out.println("Data da admissão: " + employee.getCreatedEmployee());
        System.out.println("**********  **********  **********");

    }
}