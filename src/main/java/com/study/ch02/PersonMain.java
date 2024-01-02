package com.study.ch02;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "김상현";
        p.age = 25;

        Person p2 = new Person();
        p2.name = "김상현2";
        p2.age = 26;
        // p와 p2의 주소는 서로 다름(new를 통해 새로 생성하기 때문)
    }
}
