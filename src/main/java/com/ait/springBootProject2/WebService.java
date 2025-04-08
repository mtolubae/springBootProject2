package com.ait.springBootProject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebService {


    private Library lib;

    public WebService(Library lib) {
        this.lib = lib;
    }

    public WebService() {
    }

    @Autowired
    public void setLib(Library lib) {
        this.lib = lib;
    }

    public Library getLib() {
        return lib;
    }

    public ArrayList<Book> getBooks(){
        return lib.getBooks();
    }

    public String addBook(Book b){
        return lib.addBook(b);
    }

    public List<Book> searchByAuthor(String author){
        return lib.searchAuthor(author);
    }

    public void updateBook(String title, Book b){
        lib.updateBook(title, b);
    }

    public void deleteBookByTitle(String title){
        lib.deleteBookByTitle(title);
    }
}
