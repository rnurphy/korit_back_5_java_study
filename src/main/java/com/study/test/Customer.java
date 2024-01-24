package com.study.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
    public static void main(String[] args) {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "홍길동");
        map1.put("rating", "vip");
        map1.put("age", 30);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "김기영");
        map2.put("rating", "gold");
        map2.put("age", 35);

        List<Map<String, Object>> customers = new ArrayList<>();

        customers.add(map1);
        customers.add(map2);

        for (Map<String, Object> customer : customers) {
            for (Map.Entry<String, Object> entry : customer.entrySet()) {
                System.out.println(entry);
            }
//            System.out.println(customer.entrySet());
//            System.out.println("name=" + customer.get("name"));
//            System.out.println("rating=" + customer.get("rating"));
//            System.out.println("age=" + customer.get("age"));
        }
    }
}
