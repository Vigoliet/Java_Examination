package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class UserList {
    private ArrayList<User> users = new ArrayList<>();

    // Method for adding User to the arrayList
    public void addUser(User userToAdd){
        users.add(userToAdd);
    }

    // Method for deleting User by id
    public void removeUser(int id){
        users.removeIf(user -> user.getId() == id); // Lambda expression for searching for given ID
    }

    // Method for printing the arrayList of users
    public void printUserList(){
        System.out.println(users);
    }

    // Method for sorting array list of objects by alphabetical order with a comparator
    public void sortUsersByName(){
        users.sort(Comparator.comparing(User::getName));
    }

    // Method for searching after index in list
    public User searchUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null; // Return null if the user is not found
    }
}
