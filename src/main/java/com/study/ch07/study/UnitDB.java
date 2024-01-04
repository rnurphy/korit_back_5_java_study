package com.study.ch07.study;

public class UnitDB {

    void toDB(Unit unit) {
        System.out.println("DB 저장 완료");
        System.out.println("---------------------------");
        System.out.println("<<< 결과를 출력합니다 >>>");
        System.out.println("[종족]: " + unit.brood);
        System.out.println("[이름]: " + unit.name);
        System.out.println("[가격]: " + unit.price + "원") ;
        System.out.println("[인구]: " + unit.food);
    }
}
