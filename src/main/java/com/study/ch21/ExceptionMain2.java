package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add(null);
        nameList.add("김준사");

        try {
            for (int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                if (name.equals("김준사")) {
                    System.out.println("찾음!!");
                }
            }
        }catch (NullPointerException e) {
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (Exception e) {
            // 예상하지 못한 예외를 위한 최후
            e.printStackTrace();
        }finally {
            System.out.println("이거는 무조건 실행됨");
        }
        
        System.out.println("정상 종료");
    }
}
