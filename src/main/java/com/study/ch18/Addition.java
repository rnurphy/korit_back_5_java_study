package com.study.ch18;

//  람다식전용 인터페이스임을 나타내주는 어노테이션
@FunctionalInterface
public interface Addition {
    public int add(int x, int y);
}
