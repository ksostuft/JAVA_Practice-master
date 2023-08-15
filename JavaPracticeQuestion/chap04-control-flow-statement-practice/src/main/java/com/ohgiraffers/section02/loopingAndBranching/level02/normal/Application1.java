package com.ohgiraffers.section02.loopingAndBranching.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String a = scanner.nextLine();
        for(int i = 0; i<a.length();i++) {
            System.out.printf("%d : %c\n", i, a.charAt(i));
        }
        scanner.close();
    }

}
