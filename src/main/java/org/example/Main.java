package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UserList userList = new UserList();

        // Adding some initial users, can also be removed
        User user1 = new User(1, "Vigor", "vigor.lundkvist@live.se");
        User user2 = new User(2, "Andreas", "andreas.test@gmail.com");
        userList.addUser(user1); userList.addUser(user2); // Adding all the objects to the list
        userList.printUserList();
    }
}