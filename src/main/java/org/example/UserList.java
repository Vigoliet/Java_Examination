package org.example;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users = new ArrayList<>();

    // Method for adding User to the arrayList
    public void addUser(User userToAdd){
        users.add(userToAdd);
    }

    // Method for deleting User by id
    public void removeUser(int id){

    }

    // Method for printing the arrayList of users
    public void printUserList(){
        System.out.println(users);
    }

    // Method for sorting arrayList of objects by alphabetical order
    public void sortUsersByName(){

    }

    // Method for searching after index in list
    public User searchUserById(int id){
        return null;
    }
}
