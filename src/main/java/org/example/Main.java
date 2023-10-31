package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final UserList userList = new UserList();
    public static void main(String[] args) {

        runProgram();

    }

    private static void runProgram(){
        while (true) {
            try {
                var inputOption = mainMenu();

                handleInputOption(inputOption);

            } catch (InputMismatchException e) {
                System.out.println("Write a number next time");
            }

        }
    }

    private static int mainMenu() {
        printMainMenu();

        return getMenuOption();
    }

    private static int getMenuOption() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private static void printMainMenu() {
        // Will need a scanner and switch case, for different methods and user input
        System.out.println("""
                Choose an action:\s
                1-Add user\s
                2-Delete user
                3-Print all users
                4-Search after user by index
                5-Sort users
                6-Exit program""");
    }

    private static void handleInputOption(int inputOption) {
        switch (inputOption) {
            // Add user
            case 1:
                addUser();
                break;
            // Remove user
            case 2:
                removeUser();
                break;
            // Print list of users
            case 3:
                userList.printUserList();
                break;
            // Search after user by index
            case 4:
                searchUserById();
                break;
            // Sort users in array list
            case 5:
                userList.sortUsersByName();
                break;

            case 6:
                System.exit(0);
                break;

            default:
                System.out.println("Write a correct number next time");
                break;
        }
    }

    private static void searchUserById() {
        Scanner scanner = new Scanner(System.in);

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
    }

    private static void removeUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID to remove:");
        int idToRemove = scanner.nextInt();
        userList.removeUser(idToRemove);
    }

    private static void addUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user to add: ");
        String nameToAdd = scanner.next();
        System.out.println("Enter Email to add: ");
        String emailToAdd = scanner.next();

        User userToAdd = new User(nameToAdd, emailToAdd);
        userList.addUser(userToAdd);

    }

}