package org.example;

import models.Employee;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test");

        Employee employee = new Employee(new BigDecimal("3000"));
    }
}