package com.study.ch08.car;

public class CarRepository {
    final Car[] cars;   // 레파지토리 생성될 때 무조건 있어야 하는 값임

    CarRepository(Car[] cars) {
        this.cars = cars;
    }

    int getEmptyIndex() {
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Car car) {
        cars[getEmptyIndex()] = car;
    }

    Car[] getCarData() {
        int carCount = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                carCount++;
            }
        }
        Car[] newCars = new Car[carCount];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars;
    }

}
