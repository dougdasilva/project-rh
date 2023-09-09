package models;

public class Employee {

    private Long id;
    private PersonalData data;
    private EmployeeCheck employeeCheck;

    public Employee(PersonalData data, EmployeeCheck employeeCheck) {
        this.data = data;
        this.employeeCheck = employeeCheck;
    }
}
