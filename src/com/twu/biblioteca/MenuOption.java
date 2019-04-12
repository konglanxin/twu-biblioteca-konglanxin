package com.twu.biblioteca;
import java.util.*;

public class MenuOption {
    private List<String> options;
    public MenuOption(List<String> options){
        this.options = options;
    }

    public void showMenu(){
        System.out.println("-----------------");
        System.out.println("Menu");
        for(int i = 0 ; i < options.size(); i++){
            System.out.println(options.get(i));
        }
    }

    public boolean isValidOption(int option){
        if(option <= 0 || option > 8){
            System.out.println("Please select a valid option");
            return false;
        }else{
            return true;
        }

    }

    public void selectOption(Library library, MovieList movielist){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int optionIndex = sc.nextInt();
            if(isValidOption(optionIndex)){
                switch (optionIndex){
                    case 1:
                        System.out.println("-------------------");
                        System.out.printf("%s %s %s\n","Title/", "Author/", "Year Published");
                        for (Book book : library.getBooks()) {
                            System.out.printf("%s %s %s\n",book.getTitle()+"/", book.getAuthor()+"/", book.getYearPublished());
                        }
                        break;
                    case 2:
                        System.out.println("Please enter the book title:");
                        String tag = sc.nextLine();
                        String title = sc.nextLine();
                        if(library.searchBook(title)){
                            System.out.println("Thank you! Enjoy the book!");
                        }else{
                            System.out.println("Sorry, that book is not available");
                        }
                        break;
                    case 3:
                        System.out.println("Please enter the book title:");
                        String tag2 = sc.nextLine();
                        String titleReturn = sc.nextLine();
                        if(library.searchBook(titleReturn)){
                            System.out.println("Thank you for returning the book.");
                        }else{
                            System.out.println("That is a not valid book to return.");
                        }
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    case 5:
                        System.out.println("-------------------");
                        System.out.printf("%s %s %s\n","Name/", "Year/", "Director/", "Rating");
                        for (Movie movie : movielist.getMovies()) {
                            System.out.printf("%s %s %s\n",movie.getName()+"/", movie.getYear()+"/", movie.getDirector(), movie.getDirector(), movie.getRating());
                        }
                        break;
                    case 6:
                        System.out.println("Please enter the movie name:");
                        String tag_movie = sc.nextLine();
                        String movieName = sc.nextLine();
                        if(library.searchBook(movieName)){
                            System.out.println("Thank you! Enjoy the movie!");
                        }else{
                            System.out.println("Sorry, that movie is not available");
                        }
                        break;
                    case 7:
                        System.out.println("Login successfully");
                        UserManager userManager = new UserManager();
                        System.out.printf("%s %s %s\n","Name/", "email/", "phoneNumber/");
                        Users user = userManager.getUsers();
                        System.out.printf("%s %s %s\n",user.getName()+"/", user.getEmail()+"/", user.getPhoneNumber());
                        break;
                }
            }

            showMenu();
            selectOption(library, movielist);
        }
    }

}
