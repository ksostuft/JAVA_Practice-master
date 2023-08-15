package com.ohgiraffers.section02.demensionalArray.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        int[][] a = new int[3][4];
        int count = 0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                a[i][j] = ++count;
            }
        }
        for(int[] i : a) {
            int first = 0;
            for(int j : i) {
                if(first == 0) {
                    System.out.print(j);
                    first = 1;
                } else {
                    System.out.printf("%3d",j);
                }
            }
            System.out.println();
        }
    }

}
