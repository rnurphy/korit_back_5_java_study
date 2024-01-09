package com.study.ch10;
/*
* [ 추상화 ]
* 1. 추상클래스 abstract class - 공통점을 뽑아낸다.
* 2. 인터페이스 interface
* */
public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    // 추상 메서드(반드시 재정의)
    // 추상클래스와 인터페이스에서만 정의가 가능
    abstract void showDeviceState();
}
