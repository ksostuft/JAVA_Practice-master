package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] season = {"", "겨울", "겨울", "봄", "봄", "봄", "여름", "여름", "여름", "가을", "가을", "가을", "겨울"};
        if(num > 0 && num < 13) {
            System.out.println(season[num]);
        } else {
            System.out.println("잘못입력하셨습니다");
        }
        scanner.close();
    }

}
