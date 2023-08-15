package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application7 {

    public static void main(String[] args) {

        String[] fruits = {"사과", "바나나", "복숭아", "키위"};
        String[] prices = {"1000원", "3000원", "2000원", "5000원"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String fruitName = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < 4; i++) {
            if(fruitName.equals(fruits[i])) {
                System.out.printf("%s의 가격은 %s입니다.", fruits[i], prices[i]);
                count = 1;
            }
        }
        if(count == 0) {
            System.out.println("준비된 상품이 없습니다.");
        }
    }

}
