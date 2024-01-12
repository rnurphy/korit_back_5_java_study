package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        /*
        * 1. java.lang.Runnable - void run()
        * >> 매개변수 X, 반환값 X
        * */
        Runnable start = () -> {
            System.out.println("프로그램 실행");
            System.out.println("데이터 초기화");
            int a = 10;
            int b = 20;
            System.out.println(a + b);
        };
        System.out.println("--- 1. Runnable() ---");
        start.run();
        System.out.println();

        /*
        * 2. Supplier<T> - T get()
        * >> 매개변수 X, 반환값 O
        * */
        System.out.println("--- 2. Supplier<T> ---");
        Supplier<Integer> supplier1 = () -> 10;
        int a = supplier1.get();
        System.out.println(a);

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in);
//        scannerInstance.get().nextLine();
        System.out.println();

        /*
        * 3. Consumer<T> - void accept(T t)
        * >> 매개변수 O, 반환값 X
        *  */
        System.out.println("--- 3. Consumer<T> ---");
        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(newName);
        };
        setName.accept("김준일");
        Consumer<String> action = str -> System.out.println(str);
        action.accept("김준일");
        System.out.println();

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        strList.forEach(str -> System.out.println(str));

        /*
         * 4. Function<T, R> - R apply(T t)
         * >> 매개변수 O, 반환값 O
         *  */
        System.out.println("--- 4. Function<T, R> ---");
        Function<Integer, String> fx1 = num -> Integer.toString(num * num);

        String result = fx1.apply(10);
        System.out.println(result);

        String result2 = fx1.andThen(num -> {
            System.out.println("andThen에 넣은 함수 " + num);
            return "문자열" + num;
        }).apply(10);

        System.out.println(result2);

        Predicate<Integer> filterFx = num -> num % 2 == 0;

        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numList.add(i + 1);
        }
        System.out.println(numList);
        //  스트림객체로 변환, 요소를 각각 카피한후 꺼내서 filterFx로 이동
        //  참을 만족하면 새로운 공간에 담음(이것도 stream임)
        List<Integer> newList = numList.stream().filter(filterFx).collect(Collectors.toList());
        System.out.println(newList);

        //
        List<Integer> newList2 = newList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2);


















    }
}
