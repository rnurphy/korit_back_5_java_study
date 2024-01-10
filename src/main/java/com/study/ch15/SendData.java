package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor

//  제네릭 타입으로 일반 자료형은 사용할 수 없다.
public class SendData<T> {
    private int code;
    private T data;

    public void send() {
        System.out.println("[ 데이터 전송 ]");
        System.out.println("code " + code);
        System.out.println("data " + data);

    }
}
