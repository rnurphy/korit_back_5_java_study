package com.study.ch21;

import lombok.Getter;

import java.util.Map;

@Getter
//  exception으로 끝나면 예외 클래스
public class ResponseException extends RuntimeException {
    private Map<String, Object> errorMap;

    public ResponseException(String message) {
        super(message);
    }

    public ResponseException(String message, Map<String, Object> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }
}
