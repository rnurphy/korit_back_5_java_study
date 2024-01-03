package com.study.ch06;

public class For01 {
    public static void main(String[] args) {
        // 반복횟수가 정해져있고 일정하게 증가할 때
        // 반복횟수가 중심
        for(int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        // 조건이 중심
        int i = 0;
        while(i < 10) {
            System.out.println("i " + i);
            i++;
        }
    }
}
