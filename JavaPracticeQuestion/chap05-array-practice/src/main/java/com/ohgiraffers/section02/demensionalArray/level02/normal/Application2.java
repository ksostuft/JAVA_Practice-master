package com.ohgiraffers.section02.demensionalArray.level02.normal;

public class Application2 {

    public static void main(String[] args) {

        String[] a = {"홍길동" ,"이순신" ,"유관순" ,"윤봉길" ,"장영실" ,"임꺽정" ,"장보고" ,"이태백" ,"김정희" ,"대조영" ,"김유신" ,"이순신"}; // 답지에는 이순신이 아니라 이사부로 되어 있음
        String[][] b = new String[3][2];
        String[][] c = new String[3][2];
        int count = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                b[i][j] = a[count++];
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                c[i][j] = a[count++];
            }
        }
        System.out.println("== 1분단 == ");
        for(String[] w : b) {
            for(String x : w) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("== 2분단 == ");
        for(String[] w : c) {
            for(String x : w) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

}
