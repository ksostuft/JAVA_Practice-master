package com.ohgiraffers.section02.demensionalArray.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 가로와 세로 길이를 정수형으로 입력 받아
         * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
         * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
         *
         * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
         * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
         * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
         *
         * -- 입력 예시 --
         * 가로 행의 수를 입력하세요 : 5
         * 세로 열의 수를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * F H Z G
         * W F O T
         * O R X V
         * W H J X
         * W S S J
         * */
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

    }

}
