package org.example.bookprocess;

public class Book {
    private String title;
    private String author;
    private Metadata metadata;


    public Book(String title, String author, Metadata metadata) {
        this.title = title;
        this.author = author;
        this.metadata = metadata;
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

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }


    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + metadata.getPrice());
        System.out.println("Categories: " + String.join(", ", metadata.getCategories()));
        System.out.println("ISBN: " + metadata.getIsbn());
        System.out.println("Pages: " + metadata.getPages());
    }
}
