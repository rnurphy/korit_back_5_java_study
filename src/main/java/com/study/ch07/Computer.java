package com.study.ch07;

public class Computer {
    String type;
    String cpu;
    String ram;
    String disk;

    // 생성자
    // 1. 클래스의 이름과 동일
    // 2. 메서드의 형태
    Computer() {
        type = "컴퓨터";
    }
    Computer(String type) {
        this.type = type;
    }

    // 클래스 안에서 정의되는 함수 = 메서드
    void showInfo() {
        System.out.println("type: " + type);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        System.out.println("disk: " + disk);
    }
}
