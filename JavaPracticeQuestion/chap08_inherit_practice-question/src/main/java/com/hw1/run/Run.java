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

        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 // 위의 사용데이터 참고하여 3명의 학생 정보 초기화// 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서
        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트함
        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장 // 현재 기록된 사원들의 정보를 모두 출력
        /*
        * 1. 3명의 학생 정보를 기록할 수 있 게 객체 배열을 할당하고 아래의 사 용데이터를 참고하여 3명의 학생 객 체 생성 후 반복문을 통해 출력
        * 2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고 반복 문을 사용하여 키보드로 사원 정보를 입력 받도록 구현 2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고 현재까지 기록된 사원들의 정보 출력
        * * 각 클래스의 setter/getter 메소드는 직접 구현한다.
        * * Person 매개변수 생성자를 보면 name 필드는 초기화 해주지 않는다.
        * */
    }
}
