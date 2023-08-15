package com.ohgiraffers.operatorPractice;

public class Application2 {

    public static void main(String[] args) {

        int age = 19;
        if(age <=13) {
            System.out.print("어린이");
        } else if(age>13 && age <= 19) {
            System.out.print("청소년");
        } else {
            System.out.print("성인");
        }
    }

}
