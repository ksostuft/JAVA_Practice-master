package com.ohgiraffers.level02.normal.student.run;

import com.ohgiraffers.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학급을 입력하세요 : ");
        int grade = scanner.nextInt();
        System.out.print("반을 입력하세요 : ");
        int classroom = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.print("키를 입력하세요 : ");
        double height = scanner.nextDouble();
        System.out.print("성별을 입력하세요 : ");
        char gender = scanner.next().charAt(0);
        StudentVO studentVO = new StudentVO(grade, classroom, name, height, gender);
        studentVO.printInformation();
        scanner.close();
    }
}
