package com.ait.springBootProject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
    private String author;
    private int pageNumbers;
    private String title;


    public Book(String author, int pageNumbers, String title) {
        this.author = author;
        this.pageNumbers = pageNumbers;
        this.title = title;
    }

    public Book() {}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ",  + title='" + title+
                ",  pageNumbers=" + pageNumbers+ '\'' +
                '}';
    }
}
