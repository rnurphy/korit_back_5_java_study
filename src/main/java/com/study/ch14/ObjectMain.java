package com.study.ch14;

public class ObjectMain {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김준일", "동래구");
        System.out.println(objectTest.toString());
        System.out.println(objectTest); // 자동으로 toString() 호출

        ObjectTest objectTest1 = new ObjectTest("김준일", "동래구");

        System.out.println(objectTest.equals(objectTest1)); // 값까지 비교
        System.out.println(objectTest == objectTest1);      // 주소비교

        System.out.println(objectTest.getClass());  // 생성된 객체로 접근
        System.out.println(objectTest1.getClass());

        System.out.println(ObjectTest.class);   // 스태틱으로 접근

        System.out.println(objectTest.hashCode());
        System.out.println(objectTest1.hashCode());


    }

}
