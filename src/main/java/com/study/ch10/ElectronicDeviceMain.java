package com.study.ch10;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        // 익명 클래스
        ElectronicDevice electronicDevice = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("첫 번째 기기 상태 확인");
            }
        };

        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("두 번째 기기 상태 확인");
            }
        };

        ElectronicDevice remoterController = new RemoterController();

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoterController;

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        Laptop laptop = new Laptop();
        laptop.test();
    }
}
