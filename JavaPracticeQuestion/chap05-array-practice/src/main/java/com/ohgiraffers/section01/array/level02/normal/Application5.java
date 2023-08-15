package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        String[] chickens = {"후라이드", "양념", "파닭", "매콤", "치즈", "간장"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        int count = 0;
        for(String a : chickens) {
            if(name.equals(a)) {
                System.out.printf("%s치킨 배달 가능", a);
                count = 1;
            }
        }
        if(count == 0) {
            System.out.printf("%s치킨은 없는 메뉴입니다.", name);
        }
        scanner.close();
    }

}
