package com.twu.biblioteca;

public class UserManager {
    private boolean islogin;
    private Users users;
    public UserManager(){
        this.users = new Users("Titanic", "1997", "James Cameron");
        this.islogin = true;
    }

    public Users getUsers() {
        return users;
    }
}
