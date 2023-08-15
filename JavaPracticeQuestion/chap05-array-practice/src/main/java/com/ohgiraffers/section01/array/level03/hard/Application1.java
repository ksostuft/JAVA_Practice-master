package com.ohgiraffers.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int a = scanner.nextInt();
        if(a > 0 && a % 2 != 0) {
            for(int i = 1; i <= (a+1)/2; i++) {
                System.out.print(i + " ");
            }
            for(int i = (a+1)/2 + 1; i <= a; i++) {
                System.out.print(a+1 - i + " ");
            }
        } else {
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }
        scanner.close();
    }

}
