package com.demo;

// Question 4 Create a logging aspect. Create a pointcut to log all methods Of services .

// Question 5 Add a logging statement before and after the method ends .

// Question 6  Log all the methods which throw IOException.

// Question 7   Apply execution, within, args, this and bean
// expressions on the before and after advice of service bean.

// Question 8  Demonstrate the use of pointCut @Pointcut annotation
// and Reuse the expression created.

// Question 9  Access the properties of the JoinPoint in before advice.
// Print Signature of method being called and its arguments
public class Book {
    int id;
    String name;
    String type;

    public Book() {
    }

    public Book(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void printBookDetails() {
        System.out.println("book id>> " + getId() + "  book name>> " + getName() + "  book type>> " + getType());
    }

    void getCurrentDiscount() {
        System.out.println("current discount is 10%");

    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
