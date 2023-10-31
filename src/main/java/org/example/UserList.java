package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class UserList {
    private final ArrayList<User> users = new ArrayList<>();

    public void addUser(User userToAdd){
        users.add(userToAdd);
    }

    public void removeUser(int id){
        users.removeIf(user -> user.getId() == id); // Lambda expression for searching for given ID
    }

    public void printUserList(){
        System.out.println(users);
    }

    public void sortUsersByName(){
        users.sort(Comparator.comparing(User::getName));
    }

    public User searchUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null; // Return null if the user is not found
    }
}
