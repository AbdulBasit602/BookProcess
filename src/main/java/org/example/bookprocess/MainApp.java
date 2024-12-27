package org.example.bookprocess;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        BookProcessor processor = new BookProcessor();

        List<Book> books = processor.loadBooks("src/main/resources/books.json");


        System.out.println("Displaying All Books:");
        processor.displayAllBooks(books);


        System.out.println("\nBooks by William Shakespeare:");
        processor.findBooksByAuthor(books, "William Shakespeare");


        processor.calculateAveragePrice(books);


        System.out.println("\nBook with Highest Price:");
        processor.displayBookWithHighestPrice(books);


        System.out.println("\nBooks in the Fantasy Category:");
        processor.findBooksByCategory(books, "fantasy");
    }
}
