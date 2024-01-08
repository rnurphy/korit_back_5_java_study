package com.study.ch08.book;

public class BookRepository {
    final Book[] books;

    BookRepository(Book[] books) {
        this.books = books;
    }

    void insert(Book book) {
        books[emptyIndex()] = book;
    }

    int emptyIndex() {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void getData() {
        for(int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                System.out.println("NULL");
            }else {
                System.out.println(books[i].toString());
            }
        }
    }

}
