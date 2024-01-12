package com.study.ch18;

public class AdditionImpl implements Addition {
    @Override
    public int add(int x, int y) {
        System.out.println("AdditionImpl에서 호출한 add 메서드");
        return x + y;
    }
}
