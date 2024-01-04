package com.study.ch07.study;

import java.util.Scanner;

public class scMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnitService unitService = new UnitService();

        System.out.println("유닛 생성을 시작합니다.");

        System.out.print("종족을 입력하세요: ");
        String brood = scanner.nextLine();
        if(unitService.isEmptyString(brood)) {
            System.out.println("오류발생. 종료합니다.");
            return;
        }

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        if(unitService.isEmptyString(name)) {
            System.out.println("오류발생. 종료합니다.");
            return;
        }

        System.out.print("가격을 입력하세요: ");
        int price = scanner.nextInt();
        if(unitService.isEmptyValue(price)) {
            System.out.println("오류발생. 종료합니다.");
            return;
        }

        System.out.print("인구를 입력하세요: ");
        int food = scanner.nextInt();
        if(unitService.isEmptyValue(food)) {
            System.out.println("오류발생. 종료합니다.");
            return;
        }

        System.out.println("---------------------------");
        Unit unit = new Unit(brood, name, price, food);
        unitService.toService(unit);
    }
}
