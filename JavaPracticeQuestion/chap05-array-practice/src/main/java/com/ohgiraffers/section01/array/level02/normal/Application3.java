package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 : ");
        int[] a = new int[scanner.nextInt()];
        for(int i = 0; i<a.length;i++) {
            a[i] = i + 1;
        }
        for(int b : a) {
            System.out.print(b + " ");
        }

        scanner.close();
    }

}
