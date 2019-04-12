package com.twu.biblioteca;

public class Library {
    private String welcomeMessage;
    private Book[] books;

    public Library() {
        this.books = new Book[3];
        this.books[0] = new Book("Design Patterns", "Erich Gamma", "1994");
        this.books[1] = new Book("Domain-Driven Design", "Eric Evans", "2003");
        this.books[2] = new Book("Working Effectively with Legacy Code", "Michael Feathers", "2004");
    }

    public boolean searchBook(String title){
        boolean tag = false;
        for(Book book : getBooks()){
            if(book.getTitle().trim().equals(title.trim())){
                tag = true;
                break;
            }
        }
        return tag;
    }

    public Book[] getBooks() { return this.books; }

}
