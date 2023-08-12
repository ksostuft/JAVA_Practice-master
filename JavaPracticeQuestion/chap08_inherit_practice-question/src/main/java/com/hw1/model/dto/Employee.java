package com.hw1.model.dto;

public class Employee extends Person {
    private int salary;
    private String dept;
    public Employee() {

    }
    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String information() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" | ");
        sb.append(getAge());
        sb.append(" | ");
        sb.append(getHeight());
        sb.append(" | ");
        sb.append(getWeight());
        sb.append(" | ");
        sb.append(getSalary());
        sb.append(" | ");
        sb.append(getDept());
        return sb.toString();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
