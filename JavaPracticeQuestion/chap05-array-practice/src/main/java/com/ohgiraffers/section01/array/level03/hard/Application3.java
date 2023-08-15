package com.ohgiraffers.section01.array.level03.hard;

import java.rmi.activation.ActivationGroup_Stub;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Application3 {

    public static void main(String[] args) {

        int[] a = new int[4];
        Set<Integer> set = new HashSet<>();
        while (set.size() !=4) {
            set.add((int) (Math.random() * 10));
        }
        Iterator<Integer> iter = set.iterator();
        for(int i=0;i<4;i++) {
            a[i] = iter.next();
        }
        int b = 10;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int strike = 0;
            int ball = 0;
            if(b == 0) {
                System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
                scanner.close();
                return;
            }
            System.out.println(b + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            String c = scanner.nextLine();
            try {
                Integer.parseInt(c);
            } catch (NumberFormatException e) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }
            if(c.length() != 4) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }
            int[] d = new int[4];
            for(int i = 0; i < c.length();i++) {
                d[i] = Integer.parseInt(c.substring(i,i+1));
            }
            for(int i = 0;i<4;i++) {
                if(a[i] == d[i]) {
                    strike++;
                } else if(c.indexOf(String.valueOf(a[i])) != - 1) {
                    ball++;
                }
            }
            if(strike == 4) {
                System.out.println("정답입니다.");
                scanner.close();
                return;
            }
            System.out.printf("아쉽네요 %dS %dB 입니다.\n", strike, ball);
            b--;
        }
    }

}
