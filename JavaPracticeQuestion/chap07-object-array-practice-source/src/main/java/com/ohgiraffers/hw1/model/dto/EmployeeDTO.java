package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO {
    private int empNo;
    private String empName;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bounsPoint;
    private String phone;
    private String address;

    public String information() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(empNo + ", ");
        stringBuilder.append(empName + ", ");
        stringBuilder.append(dept + ", ");
        stringBuilder.append(job + ", ");
        stringBuilder.append(age + ", ");
        stringBuilder.append(gender + ", ");
        stringBuilder.append(salary + ", ");
        stringBuilder.append(bounsPoint + ", ");
        stringBuilder.append(phone + ", ");
        stringBuilder.append(address);
        return stringBuilder.toString();
    }
    public EmployeeDTO() {
    }

    public EmployeeDTO(int empNo, String empName, int age, char gender, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public EmployeeDTO(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bounsPoint, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bounsPoint = bounsPoint;
        this.phone = phone;
        this.address = address;
    }
}
