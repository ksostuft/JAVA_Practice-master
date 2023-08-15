package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int kor = scanner.nextInt();

        System.out.print("영어 점수를 입력하세요 : ");
        int eng = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int math = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        if((kor+eng+math) / 3 < 60) {
            System.out.println("평균점수 미달로 불합격입니다.");
        }
        if(kor < 40) {
            sb.append("국어 과목의 점수 미달로 불합격 입니다.\n");
        }
        if(eng < 40) {
            sb.append("영어 과목의 점수 미달로 불합격 입니다.\n");
        }
        if(math < 40) {
            sb.append("수학 과목의 점수 미달로 불합격 입니다.\n");
        }
        if(sb.toString().equals("")) {
            System.out.println("합격입니다.");
        } else {
            System.out.println(sb);
        }

        scanner.close();
    }

}
