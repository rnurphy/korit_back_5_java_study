package com.study.ch09;

public class Computer extends ElectronicDevice {
    String cpu;
    int ram;

    void playGame() {
        System.out.println("PC 게임을 합니다.");
    }

    @Override
    //  부모의 메서드와 동일한 형태로 실행문만 다시 정의할 수 있다.
    void showDeviceState() {
        System.out.print("컴퓨터 ");
        super.showDeviceState();
    }
}
