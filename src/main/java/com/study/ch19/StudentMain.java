package com.study.ch19;

public class StudentMain {
    public static void main(String[] args) {
        Student student = Student.builder()
                .name("김상현")
                .age(26)
                .address("남구 문현동")
                .build();

        System.out.println(student);
    }

}
