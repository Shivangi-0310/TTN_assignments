package Java2;
//1. Create Java classes having suitable attributes for Library management system.
// Use OOPs concepts in your design.
// Also try to use interfaces and abstract classes.

import java.util.*;

public class LibraryManagement {
    public static void main(String[] args) {
        System.out.println("Structure of library management system");
    }

}
class Librarian{
    int librarian_id;
    int librarian_name;

    public int getLibrarian_id() {
        return librarian_id;
    }

    public void setLibrarian_id(int librarian_id) {
        this.librarian_id = librarian_id;
    }

    public int getLibrarian_name() {
        return librarian_name;
    }

    public void setLibrarian_name(int librarian_name) {
        this.librarian_name = librarian_name;
    }
}
class Library {

    int libraryId;
    String libraryName;
    String address;
    Map<Integer, Book> books = new HashMap<>();
    Map<Integer, User> users = new HashMap<>();

    public Library (int libraryId, String libraryName, String address) {
        this.libraryId = libraryId;
        this.libraryName=libraryName;
        this.address = address;

    }

    public boolean addBook (Book book) {
        if (!books.containsValue(book)) {
            books.put(book.id, book);
            return true;
        }
        return false;
    }

    public boolean deleteBook (Book book) {
        if (books.containsValue(book)) {
            books.remove(book.id);
            return true;
        }
        return false;
    }

    public boolean addUser (User user) {
        if (!users.containsValue(user)) {
            System.out.println("new user - " + user.userId);
            users.put(user.userId, user);
            return true;
        }
        return false;
    }

    public boolean deleteUser (User user) {
        if (users.containsValue(user)) {
            users.remove(user.userId);
            return true;
        }
        return false;
    }

    public User findUser (int userId) {
        return users.get(userId);
    }

    public Book findBook (int bookId) {
        return books.get(bookId);
    }


}

 class Book {
    int id;
    String name;
    String author;
    int price;
    Date dueDate;


    public Book (int id, String name, String author, int price, Date date) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price=price;
        this.dueDate=date;


    }
     public void setDueDate (Date date) {
         this.dueDate = date;
     }


}
 class User {
     int userId;
     int borrowedLateFee;
     List<Book> booksBorrowed;

    public User (int uid ) {
        this.userId = uid;
    }

    public void getBooksBorrowed () {
        for (Book book: booksBorrowed) {
            System.out.println(" Id - " + book.id +  ", title - " + book.name);
        }
    }

    public boolean borrowBook (Book book) {
        book.setDueDate(new Date());
        this.booksBorrowed.add(book);
        return true;
    }

    public boolean returnBook (Book book) {
        if (booksBorrowed.indexOf(book) >= 0) {
            int dueBy= 11; // assuming due by 11 days
            if (dueBy > 10) {
                borrowedLateFee= borrowedLateFee+10;
            }
            this.booksBorrowed.remove(book);
            return true;
        }
        return false;
    }

}
