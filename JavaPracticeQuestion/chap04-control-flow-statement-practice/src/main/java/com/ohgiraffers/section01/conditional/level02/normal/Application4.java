package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application4 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("국어점수 : ");
        int kor = scanner.nextInt();
        System.out.print("수학점수 : ");
        int math = scanner.nextInt();
        System.out.print("영어점수 : ");
        int eng = scanner.nextInt();
        boolean isPass = true;
        if((kor+eng+math) / 3 < 60) {
            isPass = false;
        }
        if(kor < 40) {
            isPass = false;
        }
        if(eng < 40) {
            isPass = false;
        }
        if(math < 40) {
            isPass = false;
        }
        if(isPass) {
            System.out.println("국어점수 : " + kor);
            System.out.println("수학점수 : " + math);
            System.out.println("영어점수 : " + eng );
            System.out.println("합계 : " + (kor + math + eng) );
            System.out.println("평균 : " + (kor + math + eng) / 3.0 );
            System.out.println("축하합니다, 합격입니다!");
        } else {
            System.out.println("불합격입니다.");
        }
        scanner.close();
    }

}
