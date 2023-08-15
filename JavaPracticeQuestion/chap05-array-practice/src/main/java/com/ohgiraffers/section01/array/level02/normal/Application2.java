package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        char[]a = scanner.nextLine().substring(0, 8).concat("******").toCharArray();
        for(char b : a) {
            System.out.print(b);
        }
        scanner.close();
    }

}
