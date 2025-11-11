package com.streams.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class EmployeeDto {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String dateOfJoining;
    private int salary;
    private String department;
    private int age;
    private String gender;
    private String address;
}
