package packageCollection;
// Question 5 Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name.
// Class Student{ String Name; Double Score; Double Age

import java.util.*;

class Student {
    String sName;
    Double score;
    Double sAge;

    public Student(String sName, Double score, Double sAge) {
        this.sName = sName;
        this.score = score;
        this.sAge = sAge;
    }

    public String getName() {
        return sName;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getAge() {
        return sAge;
    }

    public void setAge(Double sAge) {
        this.sAge = sAge;
    }
}

public class Question5 {
    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student("Aakash", 98.5, 23d));
        studentList.add(new Student("Shivangi", 90.0, 23d));
        studentList.add(new Student("Sukirti", 92.9, 25d));
        studentList.add(new Student("Karishma", 90.0, 21d));
        studentList.add(new Student("Rajat", 94.6, 20d));

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.getScore()-o1.getScore()==0)

                    return o1.getName().compareTo(o2.getName());
                return (int)(o2.getScore()-o1.getScore());

            }
        });
        System.out.println("Students according to highest and lowest marks order or by name order are :");
        for (Student s: studentList) {
            System.out.println("Student name :" + s.getName() + " ,Student score: " + s.getScore() + " ,Student age: " + s.getAge());
        }

        }
}
