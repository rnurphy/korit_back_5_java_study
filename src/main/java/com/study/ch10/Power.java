package com.study.ch10;

// 인터페이스는 기본적으로 모든 메서드가 추상 메서드
// 변수 선언 불가능
// 상수 선언만 취급
// 'default' 키워드를 통해 일반 메서드 정의 가능

public interface Power {
    String ERROR_CODE = "-9999";
    boolean powerState = false;

    void setPowerOn();
    void setPowerOff();

    default void test() {
        System.out.println("테스트를 시작합니다.");
    }
}
