package com.ait.springBootProject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebService {

    @Autowired
    private Library lib;

    public WebService(Library lib) {
        this.lib = lib;
    }

    public WebService() {
    }

    public Library getLib() {
        return lib;
    }

    public ArrayList<Book> getBooks(){
        return lib.getBooks();
    }

    public void setLib(Library lib) {
        this.lib = lib;
    }
}
