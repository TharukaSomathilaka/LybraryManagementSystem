
package controllers;

public class Book {

    private String bookIdIsbn;
    private String title;
    private String author;
    private String category;
    private int publishedYear;
    private int quantity;

    public Book(String bookIdIsbn, String title, String author,
                String category, int publishedYear, int quantity) {

        this.bookIdIsbn = bookIdIsbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publishedYear = publishedYear;
        this.quantity = quantity;
    }

    public String getBookIdIsbn() {
        return bookIdIsbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public int getQuantity() {
        return quantity;
    }
}
