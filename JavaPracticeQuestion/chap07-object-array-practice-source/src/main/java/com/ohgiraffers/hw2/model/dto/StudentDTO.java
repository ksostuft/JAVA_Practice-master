package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public String imformation() {
        StringBuilder sb = new StringBuilder();
        sb.append(grade + "\t\t");
        sb.append(classroom + "\t\t");
        sb.append(name + "\t\t");
        sb.append(kor + "\t\t");
        sb.append(eng + "\t\t");
        sb.append(math + "\t\t");
        return sb.toString();
    }
}
