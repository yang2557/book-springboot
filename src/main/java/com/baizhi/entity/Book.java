package com.baizhi.entity;

public class Book {
    private int id;
    private String name;
    private Double price;
    private String author;
    private String description;

    public Book(int id, String name, Double price, String author, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.description = description;
    }

    public Book() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
