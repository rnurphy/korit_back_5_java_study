package com.study.ch04;

public class Operation05 {
    public static void main(String[] args) {
        /*
        * int x = 0;
        * int y = 1;
        *
        * x와 y중 하나라도 값이 0이면 결과는 "오류"
        * */
        int x = 3;
        int y = -1;
        String result1 = x == 0 || y == 0 ? "오류"
                       : (x > 0 ? (y > 0 ? "1사분면" : "4사분면")
                       : (y > 0 ? "2사분면" : "3사분면"));

        // 가독성면에서 아래의 코드가 더 좋음
        String result2 = x > 0 && y > 0 ? "1사분면"
                       : x < 0 && y > 0 ? "2사분면"
                       : x < 0 && y < 0 ? "3사분면"
                       : x > 0 && y < 0 ? "4사분면" : "오류";
        System.out.println(result1);
        System.out.println(result2);
    }
}
