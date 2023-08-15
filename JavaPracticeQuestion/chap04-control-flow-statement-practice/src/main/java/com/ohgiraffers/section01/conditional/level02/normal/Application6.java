package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();
        System.out.print("연산기호를 입력하세요: ");
        scanner.nextLine();
        String operator = scanner.nextLine();
        scanner.close();
        switch (operator) {
            case "+":
                System.out.printf("%d %s %d = %d", num1, operator, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("%d %s %d = %d", num1, operator, num2, num1 - num2);
                break;
            case "*":
                System.out.printf("%d %s %d = %d", num1, operator, num2, num1 * num2);
                break;
            case "/":
                System.out.printf("%d %s %d = %d", num1, operator, num2, num1 / num2);
                break;
            case "%":
                System.out.printf("%d %s %d = %d", num1, operator, num2, num1 % num2);
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        }
    }

}
