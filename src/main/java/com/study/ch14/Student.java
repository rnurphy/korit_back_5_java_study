package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data   // @Setter, @Getter, @EqualsAndHashCode, @ToString

public class Student {
    private String name;
    private String phone;
    private String address;
    private int age;
}
