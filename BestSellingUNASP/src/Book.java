

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {
    private String title;
    private String author;
    private String userRating;
    private String reviews;
    private String price;
    private String year;
    private String genre;

    // Constructor
    public Book(String title, String author, String userRating, String reviews, String price, String year, String genre) {
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getUserRating() {
        return userRating;
    }

    public String getReviews() {
        return reviews;
    }

    public String getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }


    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("User Rating: " + userRating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println();
    }

   public int numberOfBookByAuthor(List<Book> livros, String author) {
        int count = 0;

        for (Book book : livros) {
            if(book.getAuthor().equals(author)) {
                count++;
            }
        }
        return count;
    }

    public List<String> listOfAuthors (List<Book> livros, String author) {

        Set<String> authors = new HashSet<String>();

        for (Book book : livros) {
            authors.add(book.getAuthor());

        }
        return new ArrayList<>(authors);
    }


}