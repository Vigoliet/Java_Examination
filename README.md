# Examination - CRUD program for users

This is a simple CRUD console program in Java with User objects and an array as database.
Note that this could also be used with SQLite or other DB options.
>NOTE that since this program uses an array to store the data,
> that after exiting / closing the program.
> You will lose all data that you've used / put in.

---

## How to run the code

1. Pull the code from [GitHub](https://github.com/Vigoliet/Java_Examination)
2. Open the project in Intellij IDEA
3. Run `Main()` from `org.example`

>When starting the project make sure files are not corrupt. <br> <br> If everything 
>is fine after pulling down the project you should be good to go.

---

## Project Structure

### `Main.java`

This file is the entry point and will call all the necessary methods for the console
program.

### `User.java`

This file is the model class for Users.

### `UserList.java`

This file contains all the methods that are called upon for the CRUD program on cars.

---
# Clean Code principles applied to the project

## Summary of clean code principles followed:

### Method/functions rules:
1. Small.
2. Do one thing.
3. Use descriptive names.

### Comment rules:
1. Always try to explain yourself in code.
2. Don't be redundant.
3. Don't comment out code. Just remove.
4. Use as explanation of intent.

### Source code structure:
1. Separate concepts vertically. `Ctrl + Alt + L`
2. Related code should appear vertically dense.
3. Dependent functions should be close.
4. Similar functions should be close.
5. Place functions in the downward direction.
6. Don't use horizontal alignment.
7. Use white space to associate related things and disassociate weakly related.
8. Don't break indentation.

## Names rules
1. Choose descriptive and unambiguous names.
2. Use pronounceable names.
3. Use searchable names.
4. Avoid encodings. Don't append prefixes or type information.

>I've kept this project to all the conventions above but not all clean code principles that exist,
> scroll down to see some more in-depth examples.

---

## Do one thing example:
Originally with this example in early stages of development,
I used the switch here in the main class method. <br>

However, when I applied clean code principles, I decided to break out the switch into many small 
private methods in the main file. 



```java
 public static void main(String[] args) {

        runProgram();

    }

```
This makes it simple to read in the main method, and changing things in the switch you can go
to the corresponding part of the switch.

```java
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
```
>**NOTE** This could also be further improved by moving the switch
into a new java file for just this. However, I deemed that since this program is relatively small
so this is not necessary.

---

## Comment examples:

>Keep in mind that comments are needed when someone on the same level as me would need a comment.
> To understand the context or understanding.

This is an example of how the code previously looked when structuring the methods needed in the file
```java
// Method for adding a user
    public void addUser(User userToAdd){
    }
```    
However, when I was done with the method and applying it to the project as seen below. <br>

The comment was removed since I feel the method is pretty straight forward with the name alone.<br>



```java
    public void addUser(User userToAdd){
        users.add(userToAdd);
    }
```

This was also applied to the other 4 methods except for removeUser method shown below.

```java
 public void removeUser(int id){
        users.removeIf(user -> user.getId() == id); // Lambda expression for searching for given ID
    }
```
The shown comment clearly just points out that this is a lambda expression that is not common knowledge 
to students on the same level of programming as myself.



---
# How to set up this project with linux
>Make sure you have a Linux machine, or a linux distribution like `ubuntu` and that you've set 
> up this environment with username and a password.

1. `java -version` (just use this to check if you've got java installed)
2. `sudo apt-get update`
3. `sudo apt install openjdk-19-jdk-headless`
4. `sudo update-alternatives --config java` (choose which version of java to use)
5. Create a new directory: `mkdir CatalogName`
6. Move into the created directory:`cd CatalogName`
7. Create files: `cat Main.java` `cat User.java` `cat Userlist.java`
Make sure to add all the code from the linked GitHub into the corresponding file.
8. Compile project: `javac Main.java User.java UserList.java` 