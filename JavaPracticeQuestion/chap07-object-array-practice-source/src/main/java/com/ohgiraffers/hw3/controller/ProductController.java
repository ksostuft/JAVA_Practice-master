package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {
    // 필드 타입은 Product 아니면 ProductDTO?
    private ProductDTO[] pro = new ProductDTO[10];
    public int count;
    Scanner sc;
    public void mainMenu() {
        do {
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("3. 제품 검색");
            System.out.println("4. 제품 수정");
            System.out.println("5. 제품 삭제");
            System.out.println("9. 프로그램 종료");
            sc = new Scanner(System.in);
            System.out.print("메뉴 번호를 입력하세요 : ");
            switch (sc.nextInt()) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 3:
                    productSearch();
                    break;
                case 4:
                    productModify();
                    break;
                case 5:
                    productDelete();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
            }
        } while (true);
    }
    public void productInput() {
        sc = new Scanner(System.in);
        if(count < 11) {
            System.out.print("제품 번호를 입력하세요 : ");
            int pId = Integer.parseInt(sc.nextLine());
            System.out.print("제품명을 입력하세요 : ");
            String pName = sc.nextLine();
            System.out.print("제품 가격을 입력하세요 : ");
            int price = sc.nextInt();
            System.out.print("제품 세금을 입력하세요 : ");
            double tax = sc.nextDouble();
            pro[count++] = new ProductDTO(pId, pName, price, tax);
        } else {
            sc.close();
        }
    }
    public void productPrint() {
        System.out.println("제품 번호 | 제품명 | 제품 가격 | 제품 세금");
        for(int i=0;i<10;i++) {
            if(pro[i] != null) {
                System.out.print(pro[i].information());;
            }
        }
    }
    public void productSearch() {

        System.out.print("검색할 제품명을 입력하세요 : ");
        sc = new Scanner(System.in);
        String findName = sc.nextLine();
        for(int i=0;i<10;i++) {
            if(pro[i] != null) {
                String[] names = pro[i].information().split(" | ");
                if(names[i].indexOf(findName) != -1) {
                    System.out.print(pro[i].information());
                    sc.close();
                    break;
                }
            }
        }
    }
    public void productModify() {
        System.out.print("수정할 제품번호를 입력하세요 : ");
        sc = new Scanner(System.in);
        String findName = sc.nextLine();
        for(int i=0;i<10;i++) {
            if(pro[i] != null) {
                String[] names = pro[i].information().split(" | ");
                if(findName.equals(names[0])) {
                    System.out.print("제품 번호를 입력하세요 : ");
                    int pId = Integer.parseInt(sc.nextLine());
                    System.out.print("제품명을 입력하세요 : ");
                    String pName = sc.nextLine();
                    System.out.print("제품 가격을 입력하세요 : ");
                    int price = sc.nextInt();
                    System.out.print("제품 세금을 입력하세요 : ");
                    double tax = sc.nextDouble();
                    pro[i] = new ProductDTO(pId, pName, price, tax);
                    sc.close();
                    break;
                }
            }
        }
    }
    public void productDelete() {
        System.out.print("삭제할 제품번호를 입력하세요 : ");
        sc = new Scanner(System.in);
        String findName = sc.nextLine();
        for(int i=0;i<10;i++) {
            if(pro[i] != null) {
                String[] names = pro[i].information().split(" | ");
                if(findName.equals(names[0])) {
                    pro[i] = null;
                    sc.close();
                    break;
                }
            }

        }
    }

}
