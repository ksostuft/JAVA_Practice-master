package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int[] a = new int[scanner.nextInt()];
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
            sum += a[i] = scanner.nextInt();
        }
        for(int b : a) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.print("총합 : " + sum);
        scanner.close();
    }
}
