package com.study.ch04;

public class Operation06 {
    public static void main(String[] args) {
        /*
        * 조건 연산자(삼항 연산자)
        *
        * a > 0 ? "양수" : a == 0 ? "0" : "음수"
        *
        * */

        int iResult = 10 > 2 ? 1111 : 2222;
        String sResult = 10 > 2 ? "1111" : "2222";
        boolean bResult = 10 > 2;

        // 둘의 차이를 구분할 것
        String name1 = null;    // 주소조차 할당받지 않음
        String name2 = "";      // 빈 문자열(주소는 할당됨)
        // name1의 경우는 참조 불가능 ex) name1.equals("김상현");
        // 순서를 바꾸면 참조가 가능  ex) "김상현".equals(name1);

        String name3 = "김상현";
        String name4 = new String("김상현");

        System.out.println(name3 == name4);
        System.out.println(name3 == "김상현");
        System.out.println(name3 == "김상현");
    }
}
