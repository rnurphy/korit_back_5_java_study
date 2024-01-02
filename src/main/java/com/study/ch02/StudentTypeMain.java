package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        StudentType s1 = new StudentType();

        s1.name = "김상현";
        s1.address = "부산 남구 문현동";
        s1.studentYear = 1;

        System.out.println(s1.name);
        System.out.println(s1.address);
        System.out.println(s1.studentYear + "학년");

        // s1은 StudentType으로 만듬
        Person p = s1;
        StudentType s2 = (StudentType) p;
        
        // 전주환은 Person으로 만듬
        // 애초에 상위타입이라 하위타입으로 다운캐스팅해서 확장된 범위 참조 불가
//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환;

        Person 전주환 = new StudentType();
        Person 전주환사람 = 전주환;
        StudentType 전주환학생2 = (StudentType) 전주환사람;


    }
}
