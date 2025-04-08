package com.ait.springBootProject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {


    private WebService service;


    public WebController(WebService service) {
        this.service = service;
    }

    public WebController() {
    }

    @GetMapping("/")
    public String showHomePage(){
        return "Welcome to my Home Page";
    }

    @GetMapping("/about")
    public String showAboutMessage(){
        return "This is a dummy web page for Spring Web";
    }

    @GetMapping("/books")
    public ArrayList<Book> displayBooks(){
        return service.getBooks();
    }

    @Autowired
    public void setService(WebService service) {
        this.service = service;
    }
}
