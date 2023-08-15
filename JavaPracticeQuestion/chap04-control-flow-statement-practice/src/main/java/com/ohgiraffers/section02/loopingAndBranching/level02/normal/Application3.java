package com.ohgiraffers.section02.loopingAndBranching.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = scanner.nextInt();
        for(int i = 1; i <= a;i++) {
            if(i % 2 == 1) {
                System.out.print("수");
            } else {
                System.out.print("박");
            }
        }
        scanner.close();
    }

}
