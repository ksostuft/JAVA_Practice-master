package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("문자열을 하나 입력하세요 : ");
        String a = scanner.nextLine();
        char[] b = new char[a.length()];
        for(int i = 0; i < a.length();i++) {
            b[i] = a.charAt(i);
        }
        System.out.print("검색할 문자를 입력하세요 : ");
        int count = 0;
        char c = scanner.nextLine().charAt(0);
        for(char e : b) {
            if(e == c) {
                count++;
            }
        }
        System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 l은 %d개 입니다.",a ,count);
        scanner.close();
    }

}
