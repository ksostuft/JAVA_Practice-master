package com.ohgiraffers.section01.array.level01.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        String[] a = {"딸기", "바나나", "복숭아", "키위", "사과"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int b = scanner.nextInt();
        if(b < 0 || b > 4) {
            System.out.println("준비된 과일이 없습니다.");
        } else {
            System.out.println(a[b]);
        }
        scanner.close();
    }

}
