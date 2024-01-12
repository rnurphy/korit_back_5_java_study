package com.study.ch17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준일");
        nameList.add("김준삼");
        nameList.add("김준사");

        System.out.println(nameList);



        //  Set 은 수정의 개념이 없다.
        //  순서 관련된 메서드는 다 없다.
        HashSet<String> names = new HashSet<>();
        names.addAll(nameList);

        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        newNameList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return Objects.hash(o2) - Objects.hash(o1);   // 정방향 정렬
                return Objects.hash(o1) - Objects.hash(o2);     // 역방향 정렬
            }
        });
        System.out.println(newNameList);

        System.out.println(nameList.get(1));

        String findName = null;

        for (String name : names) {
            if (names.equals("김준삼")) {
                findName = name;
                break;
            }
        }
    }
}
