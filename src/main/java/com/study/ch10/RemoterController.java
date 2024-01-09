package com.study.ch10;

public class RemoterController extends ElectronicDevice {
    // Ctrl + i - 필수 오버라이딩 단축키
    @Override
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다.");
    }
}
