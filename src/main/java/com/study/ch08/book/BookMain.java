package com.study.ch08.book;

import java.util.Scanner;
//  데이터 관련(CRUD) - 레파지토리
//  그 외 - 서비스
//  서비스는 무조건 거쳐서 간다(별거 없더라도)
//  결합도는 낮추고, 응집도는 높인다.
public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String input = null;

        Book[] books = new Book[5];
        BookRepository bR = new BookRepository(books);
        BookService bS = new BookService(bR);

        while(flag) {
            System.out.println("<<< 도서 프로그램 >>>");
            System.out.println("1. 도서 등록하기");
            System.out.println("2. 도서 조회하기");
            System.out.println("3. 프로그램 종료");

            System.out.print("작업 선택 >>> ");
            input = scanner.nextLine();

            if(input.equals("3")) {
                break;
            } else if (input.equals("1")) {
                System.out.println("\n----- 도서 등록 -----");
                String title = null;
                String writer = null;

                if(bS.isFull()) {
                    System.out.println("더 이상 추가할 수 없습니다.");
                    continue;
                }

                System.out.print("제목: ");
                title = scanner.nextLine();
                System.out.print("저자: ");
                writer = scanner.nextLine();

                if(title.isBlank() || writer.isBlank()) {
                    System.out.println("다시 입력하세요.");
                    continue;
                }

                bS.add(new Book(title, writer));

/*                for(int i = 0; i < books.length; i++) {
                    if(books[i] == null) {
                        books[i] = book;
                        break;
                    }
                }*/

                System.out.println("----- 등록 완료 -----\n");

            } else if (input.equals("2")) {
                System.out.println("\n----- 도서 조회 -----");
                bS.printData();
                System.out.println("----- 조회 완료 -----\n");
            } else {
                System.out.println("다시 입력하세요");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
