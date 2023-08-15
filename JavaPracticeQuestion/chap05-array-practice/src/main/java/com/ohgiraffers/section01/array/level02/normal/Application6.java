package com.ohgiraffers.section01.array.level02.normal;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        int[] nums = new int[10];
        for(int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 10 + 1);
        }
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(nums);
        System.out.println("최대값 : " + nums[9]);
        System.out.println("최소값 : " + nums[0]);

    }

}
