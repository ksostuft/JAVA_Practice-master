package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("체중을 입력하세요(kg) : ");
        double weight = scanner.nextDouble();
        System.out.print("신장을 입력하세요(cm) : ");
        double height = scanner.nextDouble() / 100;
        double bmi = weight / (height * height);
        if(bmi < 20) {
            System.out.println("당신은 저체중 입니다.");
        } else if(bmi >=20 && bmi < 25) {
            System.out.println("당신은 정상체중 입니다.");
        } else if(bmi >=25 && bmi < 30) {
            System.out.println("당신은 과체중 입니다.");
        } else if(bmi >=30 ){
            System.out.println("당신은 비만 입니다.");
        }

        scanner.close();
    }

}
