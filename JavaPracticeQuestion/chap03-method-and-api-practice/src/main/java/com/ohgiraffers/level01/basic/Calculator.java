package com.ohgiraffers.level01.basic;

public class Calculator {

    static void checkMethod() {
        System.out.println("메소드 호출 확인");
    }
    static String sumTwoNumber(int a, int b) {
        System.out.printf("%d과 %d의 합은 %d입니다.\n", a, b, (a+b));
        return String.valueOf(a+b);
    }
    static String multiTwoNumber(int a, int b) {
        System.out.printf("%d과 %d의 곱은 %d입니다.\n", a, b, (a*b));
        return String.valueOf(a*b);
    }
}
