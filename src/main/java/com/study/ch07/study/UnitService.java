package com.study.ch07.study;

public class UnitService {
    boolean isEmptyString(String str) {
        if(str == null) {
            return true;
        }else {
            return str.isBlank();
        }
    }

    boolean isEmptyValue(Integer x) {
        return x == null || x == 0;
    }


    void toService(Unit unit) {
        System.out.println("서비스 이동 완료");

        UnitRepository unitRepository = new UnitRepository();
        unitRepository.toRepository(unit);
    }
}
