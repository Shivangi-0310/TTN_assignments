package packageCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

// Question 3 Write a method that takes a string and print the number of occurrence of each character characters
// in the string.
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ')
                if (!charMap.containsKey(s1.charAt(i))) {
                    charMap.put(s1.charAt(i), 1);
                } else {
                    charMap.put(s1.charAt(i), charMap.get(s1.charAt(i)) + 1);
                }
        }
        for (Character ch : charMap.keySet()) {
            System.out.println("character: " + ch + " occurred " + charMap.get(ch) + " times. ");
        }

    }

}
