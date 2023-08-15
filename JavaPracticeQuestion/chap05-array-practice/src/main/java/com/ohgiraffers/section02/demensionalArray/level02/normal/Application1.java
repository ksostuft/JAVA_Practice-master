package com.ohgiraffers.section02.demensionalArray.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        while (true) {
            System.out.print("가로 행의 수를 입력하세요 : ");
            a = scanner.nextInt();
            System.out.print("세로 행의 수를 입력하세요 : ");
            b = scanner.nextInt();
            boolean boolA = (a > 0 && a < 11);
            boolean boolB = (b > 0 && b < 11);
            if(boolA && boolB) {
                break;
            } else {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }
        }
        Character[][] c = new Character[a][b];
        for(int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                c[i][j] = (char) (int) (Math.random() * 26 + 65);
            }
        }
        int firstOne = 0;
        for(Character[] s : c) {
            if(firstOne != 0) {
                System.out.println();
            }
            firstOne = 1;
            int firstTwo = 0;
            for(char t : s) {
                if(firstTwo !=0) {
                    System.out.print(" ");
                }
                System.out.print(t);
                firstTwo = 1;
            }
        }
        scanner.close();
    }

}
