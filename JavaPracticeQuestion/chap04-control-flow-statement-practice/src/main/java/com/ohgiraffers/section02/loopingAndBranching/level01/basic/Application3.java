package com.ohgiraffers.section02.loopingAndBranching.level01.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("정수를 입력하세요 : ");
        int j = scanner.nextInt();

        int sum = 0;
        for(int i = 1; i <= j; i++) {
            if(i % 2 == 1) {
                continue;
            }
            sum += i;
        }
        System.out.printf("1부터 %d까지 짝수의 합 : %d",j, sum);
        scanner.close();
    }

}
