package com.study.ch02;

public class Variable {
    public static void main(String[] args) {
        int date = 20231229;
        
        // 업캐스팅
        double date2 = date;
        
        // 다운캐스팅
        int date3 = (int) date2;

        // 문자 < 정수 < 실수
        char a = '1';
        int b = a;
        double c = b;

        System.out.println(date + 1);
        System.out.println(20231229 + 1);
    }
}
