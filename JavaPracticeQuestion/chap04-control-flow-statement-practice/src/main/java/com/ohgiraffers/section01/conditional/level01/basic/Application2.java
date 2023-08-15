package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다.");
        }

        scanner.close();
    }

}
