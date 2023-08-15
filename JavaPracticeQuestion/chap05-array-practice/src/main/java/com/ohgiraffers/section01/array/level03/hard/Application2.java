package com.ohgiraffers.section01.array.level03.hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Application2 {

    public static void main(String[] args) {

        int[] a = new int[6];
        Set<Integer> set = new HashSet<>();
        while (set.size() < 6) {
            set.add((int) (Math.random() * 45 + 1));
        }

        int i = 0;
        for(int b : set) {
            a[i] = b;
            i++;
        }
        Arrays.sort(a);
        for(int b : a) {
            System.out.print(b + " ");
        }
    }

}
