package models;

import java.time.LocalDateTime;

public class Employee {

    private Long id;
    private PersonalData data;
    private EmployeeCheck employeeCheck;
    private LocalDateTime createdEmployee;

    public Employee(Long id, PersonalData data, EmployeeCheck employeeCheck) {
        this.id = id;
        this.data = data;
        this.employeeCheck = employeeCheck;
        this.createdEmployee = LocalDateTime.now();
    }

    public PersonalData getData() {
        return data;
    }

    public EmployeeCheck getEmployeeCheck() {
        return employeeCheck;
    }

    public LocalDateTime getCreatedEmployee() {
        return createdEmployee;
    }
}
