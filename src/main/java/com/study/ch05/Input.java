package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("타이틀: ");
        String title = scanner.nextLine(); // 띄어쓰기도 입력값으로 판단, enter를 인식
        
        System.out.print("a: ");
        int a = scanner.nextInt();  // 띄어쓰기를 입력의 끝으로 판단, enter를 무시
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();



        System.out.println(title + ": " + (a + b + c));
    }
}
