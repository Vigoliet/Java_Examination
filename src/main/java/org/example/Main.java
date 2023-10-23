package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserList userList = new UserList();

        // Adding some initial users, can also be removed
        User user1 = new User(1, "Vigor", "vigor.lundkvist@live.se");
        User user2 = new User(2, "Andreas", "andreas.test@gmail.com");
        userList.addUser(user1); userList.addUser(user2); // Adding all the objects to the list


        boolean loop = true;
        while (loop){

            try {
                // Will need a scanner and switch case, for different methods and user input
                System.out.println("Choose an action: \n" +
                        "1-Add user \n" +
                        "2-Delete user\n" +
                        "3-Print all users\n" +
                        "4-Search after user by index\n" +
                        "5-Sort users\n" +
                        "6-Exit program");
                Scanner scanner = new Scanner(System.in);
                int inputOption = scanner.nextInt();

                switch (inputOption){
                    // Add user
                    case 1:
                        // Take in user input
                        System.out.println("ID: ");
                        int idToAdd = scanner.nextInt();
                        System.out.println("Name: ");
                        String nameToAdd = scanner.next();
                        System.out.println("Email: ");
                        String emailToAdd = scanner.next();

                        User userToAdd = new User(idToAdd, nameToAdd, emailToAdd);
                        userList.addUser(userToAdd);

                        break;
                    // Delete user
                    case 2:
                        System.out.println("Enter ID to remove:");
                        int idToRemove = scanner.nextInt();
                        userList.removeUser(idToRemove);
                        break;
                    // Print list of users
                    case 3:
                        userList.printUserList();
                        break;
                    // Search after user by index
                    case 4:
                        System.out.println("ID: ");
                        int idToSearchFor = scanner.nextInt();
                        User foundUser = userList.searchUserById(idToSearchFor);
                        if (foundUser != null) {
                            System.out.println("User found:");
                            System.out.println("ID: " + foundUser.getId());
                            System.out.println("Name: " + foundUser.getName());
                            System.out.println("Email: " + foundUser.getEmail());
                        } else {
                            System.out.println("User not found.");
                        }
                        break;
                    // Sort users in array list
                    case 5:
                        userList.sortUsersByName();
                        break;

                    case 6:
                        loop = false;
                        break;

                    default:
                        System.out.println("Write a correct number next time");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Write a number next time");
            }

        }




        /*

        // implementation of search method
        User foundUser = userList.searchUserById(2);
        if (foundUser != null) {
            System.out.println("User found:");
            System.out.println("ID: " + foundUser.getId());
            System.out.println("Name: " + foundUser.getName());
            System.out.println("Email: " + foundUser.getEmail());
        } else {
            System.out.println("User not found.");
        } */

        /*
        userList.printUserList();
        userList.removeUser(1);
        userList.printUserList(); */








    }
}