package com.ohgiraffers.level02.normal;

public class RandomMaker {

    static String rockPaperScissors() {
        String[] rps = { "가위", "바위", "보"};
        System.out.println(rps[(int) (Math.random() * 3)]);
        return rps[(int) (Math.random() * 3)];
    }
    static String tossCoin() {
        String[] fb = { "앞면", "뒷면"};
        System.out.println(fb[(int) (Math.random() * 2)]);
        return fb[(int) (Math.random() * 2)];
    }
}
