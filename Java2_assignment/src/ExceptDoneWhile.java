import java.util.Scanner;
// Question 8a using while

public class ExceptDoneWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.next();
        while (!str.equals("done")) {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                System.out.println("First and last character are equals: " + str);
            } else {
                System.out.println("First and last character are not equals: " + str);
            }
            System.out.println("Enter a word again");
            str = input.next();
        }
    }
}

