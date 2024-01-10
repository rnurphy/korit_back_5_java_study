package com.study.ch14;

import java.util.Objects;

/*
* Object 클래스
* 모든 클래스는 기본적으로 Object 클래스를 상속받고 있음
* */
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);

        //  Objects = 오브젝트 관련 연산 메서드
        //  마지막 리턴 equals - 스태틱 메서드이다
    }

    //  주소에 관계없이 값으로 비교가 가능하다는 점이 equals 와 다른 부분
    //  클래스는 여전히 관계있음
    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
