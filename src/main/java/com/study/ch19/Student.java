package com.study.ch19;

import lombok.Data;

@Data
public class Student {
    private String name;
    private String address;
    private int age;

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private String address;
        private int age;

        public Student build() {
            return new Student(name, address, age);
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

    }
}
