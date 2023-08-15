package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        System.out.println("이름 | 나이 | 신장 | 몸무게 | 학년 | 전공");
        for(Student student : students) {
            System.out.println(student.information());
        }
        Employee[] employees = new Employee[10];
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {

            if(count > 10) {
                sc.close();
                break;
            }
            System.out.print("이름을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();
            System.out.print("신장을 입력하세요 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게를 입력하세요 : ");
            double weight = sc.nextDouble();
            System.out.print("급여를 입력하세요 : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("부서를 입력하세요 : ");
            String dept = sc.nextLine();
            employees[count-1] = new Employee(name, age, height, weight, salary, dept);
            System.out.print("계속 정보를 추가하시겠습니까? : ");
            if(!sc.nextLine().toUpperCase().equals("Y")) {
                sc.close();
                break;
            }
            count++;
        }
        System.out.println("이름 | 나이 | 신장 | 몸무게 | 급여 | 부서");

        for(Employee employee : employees) {
            if(employee != null) {
                System.out.println(employee.information());
            }
        }
    }
}
