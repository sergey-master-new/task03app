package com.example.task03app.model;

import java.util.Objects;

public class Book {

    private Long id;
    private String isbn;
    private String name;
    private Author authors;
    private int pageCount;
    private int weightInGrams;
    private double price;

    public Book() {
    }

    public Book(Long id, String isbn, String name, Author authors, int pageCount, int weightInGrams, double price) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.authors = authors;
        this.pageCount = pageCount;
        this.weightInGrams = weightInGrams;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthors() {
        return authors;
    }

    public void setAuthors(Author authors) {
        this.authors = authors;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                pageCount == book.pageCount &&
                weightInGrams == book.weightInGrams &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(isbn, book.isbn) &&
                Objects.equals(name, book.name) &&
                Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn, name, authors, pageCount, weightInGrams, price);
    }
}


