package com.study.ch04;

public class Operation04 {
    public static void main(String[] args) {
        /*
        * 연도가 주어졌을 때 윤년이면 true, 아니면 false를 출력
        * 윤년 - 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수 일 때, 0보다 크고 4001보다 작은 자연수
        *
        * */

        int year1 = 1999;    // 결과 true
        int year2 = 1999;    // 결과 falseㄴ
        int year3 = 0;       // 결과 false
        int year4 = 4001;    // 결과 false

        boolean step1 = year1 > 0;
        boolean step2 = year1 < 4001;
        boolean step3 = year1 % 4== 0;
        boolean step4 = year1 % 100 != 0;
        boolean step5 = year1 % 400 == 0;

        boolean result = step1 && step2 && (step3 && step4 || step5);

        System.out.println(result);





    }
}
