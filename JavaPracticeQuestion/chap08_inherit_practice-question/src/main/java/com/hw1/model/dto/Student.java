package com.hw1.model.dto;

public class Student extends Person {
    private int grade;
    private String major;
    public Student() {

    }
    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        this.name = name;
        this.grade = grade;
        this.major = major;
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
        sb.append(getGrade());
        sb.append(" | ");
        sb.append(getMajor());
        return sb.toString();
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
