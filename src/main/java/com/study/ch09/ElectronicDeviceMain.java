package com.study.ch09;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }

        for(int i = 0; i < electronicDevices.length; i++) {
            //  재정의된 메서드가 우선순위가 높아서 자식에서의 메서드가 호출됨
            electronicDevices[i].showDeviceState();
        }

        System.out.println();

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        System.out.println();

        for(int i = 0; i < electronicDevices.length; i++) {
            if(electronicDevices[i] instanceof Computer) {
                Computer computer = (Computer) electronicDevices[i];
                computer.playGame();
            } else if (electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }
        }

    }
}
