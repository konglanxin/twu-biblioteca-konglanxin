package com.twu.biblioteca;

public class Book {
    private String Title;
    private String Author;
    private String YearPublished;

    public Book(String Title, String Author, String YearPublished) {
        this.Title = Title;
        this.Author = Author;
        this.YearPublished = YearPublished;
    }

    public String getTitle() {
        return this.Title;
    }

    public String getAuthor() {
        return this.Author;
    }

    public String getYearPublished() {
        return this.YearPublished;
    }
}
