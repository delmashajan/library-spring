package com.example.libraryapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String author;
    private String description;
    private String language;
    private String publisher;
    private String distributor;
    private String releasedyear;
    private int price;

    private String image;

    public Book() {
    }

    public Book(int id, String title, String author, String description, String language, String publisher, String distributor, String releasedyear, int price, String image) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.language = language;
        this.publisher = publisher;
        this.distributor = distributor;
        this.releasedyear = releasedyear;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getReleasedyear() {
        return releasedyear;
    }

    public void setReleasedyear(String releasedyear) {
        this.releasedyear = releasedyear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
