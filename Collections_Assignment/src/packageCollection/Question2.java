package packageCollection;
// Question 2 Write a method that takes a string and returns the number of unique characters in the string.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s1 = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }
        System.out.println("Number of unique charactrs in string are : " + set.size());
    }

}
