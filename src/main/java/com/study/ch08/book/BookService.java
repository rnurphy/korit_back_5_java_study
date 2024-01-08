package com.study.ch08.book;

public class BookService {
    BookRepository bookRepository;

    BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;

    }

    void add(Book book) {
        bookRepository.insert(book);
    }

    boolean isFull() {
        return bookRepository.emptyIndex() == -1;
    }

    void printData() {
        bookRepository.getData();
    }
}
