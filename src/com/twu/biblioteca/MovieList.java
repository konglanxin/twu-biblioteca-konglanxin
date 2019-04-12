package com.twu.biblioteca;

public class MovieList {
    private Movie[] movies;

    public MovieList() {
        this.movies = new Movie[2];
        this.movies[0] = new Movie("Titanic", "1997", "James Cameron", "9.3");
        this.movies[1] = new Movie("Ready Player One", "2018", "Steven Spielberg","8.7");
    }

    public Movie[] getMovies() { return this.movies; }

}
