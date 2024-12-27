package org.example.bookprocess;

import java.util.List;

public class Metadata {
    private double price;
    private List<String> categories;
    private String isbn;
    private int pages;


    public Metadata(double price, List<String> categories, String isbn, int pages) {
        this.price = price;
        this.categories = categories;
        this.isbn = isbn;
        this.pages = pages;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
