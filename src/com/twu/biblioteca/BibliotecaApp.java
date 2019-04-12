package com.twu.biblioteca;
import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library library = new Library();

        List<String> options = new ArrayList(Arrays.asList(
                "1-List of books",
                "2-Checkout a book",
                "3-Return a book",
                "4-Quit"));
        MenuOption menu = new MenuOption(options);

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        menu.showMenu();
        menu.selectOption(library);






    }
}
