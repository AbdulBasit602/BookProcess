package org.example.bookprocess;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;


public class BookProcessor {

    // Method to load books from a JSON file
    public List<Book> loadBooks(String filePath) {
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader(filePath);
            Type bookListType = new TypeToken<List<Book>>(){}.getType();
            List<Book> books = gson.fromJson(reader, bookListType);
            reader.close();
            return books;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void displayAllBooks(List<Book> books) {
        for (Book book : books) {
            book.displayBookInfo();
            System.out.println();
        }
    }

    // Method to find books by author
    public void findBooksByAuthor(List<Book> books, String author) {
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());

        for (Book book : filteredBooks) {
            book.displayBookInfo();
            System.out.println();
        }
    }

    // Method to calculate the average price of all books
    public void calculateAveragePrice(List<Book> books) {
        double averagePrice = books.stream()
                .mapToDouble(book -> book.getMetadata().getPrice())
                .average()
                .orElse(0.0);

        System.out.println("Average Price: " + averagePrice);
    }

    // Method to display the book with the highest price
    public void displayBookWithHighestPrice(List<Book> books) {
        Book maxPriceBook = books.stream()
                .max((book1, book2) -> Double.compare(book1.getMetadata().getPrice(), book2.getMetadata().getPrice()))
                .orElse(null);

        if (maxPriceBook != null) {
            maxPriceBook.displayBookInfo();
        } else {
            System.out.println("No books available.");
        }
    }

    // Method to find and display books by category
    public void findBooksByCategory(List<Book> books, String category) {
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getMetadata().getCategories() != null &&
                        java.util.Arrays.asList(book.getMetadata().getCategories()).contains(category))
                .collect(Collectors.toList());

        for (Book book : filteredBooks) {
            book.displayBookInfo();
            System.out.println();
        }
    }
}
