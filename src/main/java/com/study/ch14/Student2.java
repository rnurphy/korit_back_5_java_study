package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor

public class Student2 {
    private final String name;
    private String address;
    @NonNull
    private String phone;

}
