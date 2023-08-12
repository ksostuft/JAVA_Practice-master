package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO[] emp = new EmployeeDTO[3];
        emp[0] = new EmployeeDTO();
        emp[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
        System.out.println("emp[0] : " + emp[0].information());
        System.out.println("emp[1] : " + emp[1].information());
        System.out.println("emp[2] : " + emp[2].information());
        System.out.println("=================================================================");
        emp[0] = new EmployeeDTO(0, "김말똥",  "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        emp[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
        System.out.println("emp[0] : " + emp[0].information());
        System.out.println("emp[1] : " + emp[1].information());
        System.out.println("=================================================================");
        double sum = 0;
        for(int i=0;i<3;i++) {
            String[] forSalary = emp[i].information().split(", ");
            double salary = Integer.parseInt(forSalary[6]) * (1 + Double.parseDouble(forSalary[7])) * 12;
            sum += salary;
            System.out.printf("%s의 연봉 : %.0f원\n", forSalary[1], salary);
        }
        System.out.println("=================================================================");
        System.out.printf("직원들의 연봉의 평균 : %.0f원", sum / 3);
    }
}
