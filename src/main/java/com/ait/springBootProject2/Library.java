package com.ait.springBootProject2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        Book b = new Book("JKR",500,"Harry Potter");
        Book b1 = new Book("Tolkien", 300, "LOTR");
        books.add(b);
        books.add(b1);
    }

    public void addBook(Book b){
        books.add(b);
    }

    public void displayBooks(){
        for(Book b: books){
            System.out.println(b);
        }
    }

    public ArrayList<Book> getBooks(){
        return books;
    }
}
