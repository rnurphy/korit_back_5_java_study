package com.study.ch01;

public class PrintStudy {
    public static void main(String[] args) {
        System.out.println("\uAC00");

        // 각 유니코드 값의 합이 10진수로 출력됨
        System.out.println('김' + '상' + '현');

        System.out.println("김" + "상" + "현");

        System.out.println("나이 " + (23 + 3));
        System.out.println(123);
        System.out.println(2 + 4);
        // 0000 0000
        // char 자료형 - 2바이트(한 글자 가능), 1바이트에 다 담기 힘듬
    }
}
