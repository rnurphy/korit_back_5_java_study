package com.study.ch19;

public class BuilderMain {
    public static void main(String[] args) {
        //  .builder() - static 메서드
        Car.CarBuilder carBuilder = Car.builder();
        Car car2 = carBuilder.build();

        Car car = Car.builder()
                .model("아반떼")
                .color("블랙")
                .build();


    }
}
