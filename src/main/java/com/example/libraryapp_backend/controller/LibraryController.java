package com.example.libraryapp_backend.controller;

import com.example.libraryapp_backend.dao.BookDao;
import com.example.libraryapp_backend.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class LibraryController {

    @Autowired
    private BookDao dao;

    @CrossOrigin(origins = "*")

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> Addbook(@RequestBody Book b)
    {
        System.out.println(b.getTitle().toString());
        dao.save(b);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");

        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Book> Viewbook(){
        return (List<Book>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Book> Searchbook(@RequestBody Book b){
        String title=String.valueOf(b.getTitle());
        System.out.println(title);
        return (List<Book>) dao.Searchbook(b.getTitle());

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public Map<String,String> delete(@RequestBody Book b){
        String id = String.valueOf(b.getId());
        System.out.println(id);
        dao.deleteBook(b.getId());

        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;

    }


}
