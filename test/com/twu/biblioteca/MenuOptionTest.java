package com.twu.biblioteca;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MenuOptionTest {
    @Test
    public void selectOption1() {
        Library library = new Library();
        MovieList movelist = new MovieList();
        List<String> options = new ArrayList(Arrays.asList(
                "1-List of books",
                "2-Checkout a book",
                "3-Return a book",
                "4-Quit"));
        MenuOption menuOption = new MenuOption(options);
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        menuOption.showMenu();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        menuOption.selectOption(library,movelist);

        assertEquals("-------------------\n" +
                "Title/ Author/ Year Published\n" +
                "Design Patterns/ Erich Gamma/ 1994\n" +
                "Domain-Driven Design/ Eric Evans/ 2003\n" +
                "Working Effectively with Legacy Code/ Michael Feathers/ 2004\n" +
                "-----------------\n" +
                "Menu\n" +
                "1-List of books\n" +
                "2-Checkout a book\n" +
                "3-Return a book\n" +
                "4-Quit", out.toString().trim());
    }



}
