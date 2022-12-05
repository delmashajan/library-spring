package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

    @PostMapping("/")
    public String Adminpage(){
        return "admin page";
    }
    @PostMapping("/login")
    public String Userlogin(){
        return "Userlogin";
    }
    @PostMapping("/register")
    public String Userregister(){
        return "User register";
    }

}
