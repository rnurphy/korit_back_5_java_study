package com.study.ch07;

public class ComputerMain {
    public static void main(String[] args) {
        // 객체(인스턴스)를 생성, 동적 메모리 할당(new)
        // 생성자, new는 무조건 주소를 리턴하기 때문에 리턴타입이 필요가 없음
        Computer computer1 = new Computer();
        Computer computer2 = new Computer("노트북");
        System.out.println(computer1);
        System.out.println(computer2);
        computer1.cpu = "i5";
        computer2.cpu = "i7";
        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);
        computer1.showInfo();
        computer2.showInfo();
        computer1.ram = "8GB";
        computer2.ram = "16GB";
        computer1.showInfo();
        computer2.showInfo();
    }
}
