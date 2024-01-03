package com.study.ch06;

public class For02 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 4 || i == 9) {
                System.out.print(i);
                System.out.println();
            }else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        for(int i = 10; i > 0; i--) {
            if(i == 6 || i == 1) {
                System.out.print(i - 1);
                System.out.println();
            }else {
                System.out.print(i - 1 + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if(i == 4 || i == 9) {
                System.out.print(9 - i);
                System.out.println();
            }else {
                System.out.print(9 - i + ", ");
            }
        }
        System.out.println();

        int n = 10;
        for(int i = 0; i < n; i++) {
            int rv_i = n - 1 - i;
            System.out.print(rv_i);
            if(rv_i % 5 != 0) {
                System.out.print(", ");
            }
            if(rv_i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
