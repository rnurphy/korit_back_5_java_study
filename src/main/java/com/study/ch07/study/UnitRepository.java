package com.study.ch07.study;

public class UnitRepository {

    void toRepository(Unit unit) {
        System.out.println("레파지토리 이동 완료");

        UnitDB unitDB = new UnitDB();
        unitDB.toDB(unit);
    }
}
