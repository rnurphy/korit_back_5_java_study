package com.study.ch21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomExceptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 멤버 추가 중 예외 생성");
            System.out.println("2. 멤버 조회 중 예외 생성");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >> ");
            String selectedMenu = scanner.nextLine();

            try {
                if ("q".equalsIgnoreCase(selectedMenu)) {
                    break;
                } else if ("1".equals(selectedMenu)) {
                    throw new IndexOutOfBoundsException("예외 강제 발생");
                } else if ("2".equals(selectedMenu)) {
                    Map<String, Object> errorMap = new HashMap<>();
                    errorMap.put("errorCode :", 400);
                    errorMap.put("errorMessage :", "요청 데이터가 누락되었습니다.");
                    throw new ResponseException("응답 예외", errorMap);
                } else {
                    System.out.println("다시 입력");
                }
            } catch (IndexOutOfBoundsException e) {
                //  비동기 처리
//                e.printStackTrace();
                //  동기 처리
                System.out.println(e.getMessage());
            } catch (ResponseException e) {
//                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println(e.getErrorMap());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("프로그램 종료");
    }
}
