package com.ohgiraffers.section01.array.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        int[] a = new int[10];
        for(int i = 1; i <= 10; i++) {
            a[i-1] = i;
        }
        for(int i : a) {
            System.out.println(i);
        }
    }

}
