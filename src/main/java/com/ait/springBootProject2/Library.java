package com.ait.springBootProject2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    public String addBook(Book b){
        return books.add(b) ? "Book Added" : "Failed Addition";
    }

    public void displayBooks(){
        for(Book b: books){
            System.out.println(b);
        }
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public List<Book> searchAuthor(String author){
        List<Book> foundbooks = new ArrayList<>();
        for(Book b:books){
            if(b.getAuthor().equals(author)) foundbooks.add(b);
        }
        return foundbooks;
    }

    public void updateBook(String title, Book b){
        for(Book b1:books){
            if(b1.getTitle().equals(title)){
                b1.setPageNumbers(b.getPageNumbers());
            }
        }
    }

    public void deleteBookByTitle(String title){
        for(Book b1:books){
            if(b1.getTitle().equals(title)){
                books.remove(b1);
            }
        }
    }
}
