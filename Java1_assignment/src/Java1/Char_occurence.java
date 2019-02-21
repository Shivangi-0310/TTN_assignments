package Java1;

import java.util.Scanner;

public class Char_occurence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s1= sc.nextLine().toLowerCase();
        System.out.println("Enter the character to be searched for occurence");
        char a= sc.next().toLowerCase().charAt(0);
        int occurence= s1.length()- s1.replaceAll( String.valueOf(a), "").length();
        System.out.println(occurence);

    }
}
