package com.study.ch18;

public class AdditionMain {
    public static void main(String[] args) {
        //  익명 클래스
        Addition addition1 = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        Addition addition2 = new AdditionImpl();

        System.out.println(addition1.add(10, 20));
        System.out.println(addition2.add(30, 40));

        //  람다식 핵심조건 -> 인터페이스 내에 유일한 추상 메서드가 정의되어 있어야 함
        //  단, 일반(default) 메서드는 여러개 정의되어 있어도 된다.
        //  -> 화살표를 add 함수명이라고 보면 됨 왜? 어차피 하나밖에 없으니까
        Addition addition3 = (int x, int y) -> {
            return x + y;
        };

        System.out.println(addition3.add(50, 60));

        //  1. 람다식의 매개변수 자료형은 생략할 수 있다.
        //  왜? 이미 인터페이스 내의 추상 메서드에 정의를 해놓음
        Addition addition4 = (x, y) -> {
            return x + y;
        };

        //  2. 함수의 실행문이 한 줄이면(하나의 명령문만 실행) 중괄호 생략 가능
        //  단, return은 중괄호를 생략할 시에 같이 생략한다.
        Addition addition5 = (x, y) -> x + y;

        Viewer viewer = (viewData) -> {
            System.out.println("화면 출력");
        };

        Viewer viewer2 = (viewData) -> System.out.println("화면 출력");

        //  3. 매개변수가 1개면 매개변수의 괄호를 생략할 수 있다.
        Viewer viewer3 = viewData -> System.out.println("화면 출력");















    }
}
