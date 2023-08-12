package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] studentDTOS = new StudentDTO[10];
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (true && count < 11) {
            System.out.print("학년을 입력해주세요 : ");
            int grade = scanner.nextInt();
            System.out.print("반을 입력해주세요 : ");
            int classroom = scanner.nextInt();
            scanner.nextLine();
            System.out.print("이름을 입력해주세요 : ");
            String name = scanner.nextLine();
            System.out.print("국어점수를 입력해주세요 : ");
            int kor = scanner.nextInt();
            System.out.print("영어점수를 입력해주세요 : ");
            int eng = scanner.nextInt();
            System.out.print("수학점수를 입력해주세요 : ");
            int math = scanner.nextInt();
            studentDTOS[count] = new StudentDTO(grade, classroom, name, kor
                    , eng, math);
            studentDTOS[count-1] = new StudentDTO(grade, classroom, name, kor, eng, math);
            System.out.print("계속 추가하시겠습니까? : ");
            if(scanner.next().toUpperCase().equals("Y")) {
                count++;
            } else {
                break;
            }
        }
        System.out.println("학생 정보를 출력합니다.");
        System.out.println("학년\t\t반\t\t이름\t\t\t국어점수\t영어점수\t수학점수\t평균점수");
        for(int i = 0; i < count; i++) {
            String[] forCalc = studentDTOS[i].imformation().split("\t\t");
            System.out.print(studentDTOS[i].imformation());;
            double avg = (Integer.parseInt(forCalc[3]) + Integer.parseInt(forCalc[4]) + Integer.parseInt(forCalc[5])) / 3.0;
            System.out.printf("%.1f\n", avg);
        }
    }
}
