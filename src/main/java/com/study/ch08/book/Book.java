package com.study.ch08.book;

public class Book {
    String title;
    String writer;

    Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
