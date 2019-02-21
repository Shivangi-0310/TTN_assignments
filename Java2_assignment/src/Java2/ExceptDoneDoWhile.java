package Java2;
//8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
//        a)while statement
//        b)do-while statement
//Question 8b do-while
import java.util.Scanner;

public class ExceptDoneDoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = input.next();
        do {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                System.out.println("First and last character are equals: " + str);
            } else {
                System.out.println("First and last character are not equal: " + str);
            }
            System.out.println("enter the word again");
            str = input.next();
        } while (!str.equals("done"));
    }
}