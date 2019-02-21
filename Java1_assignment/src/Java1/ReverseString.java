package Java1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string to be reversed: ");
        String s1= sc.nextLine();
        StringBuffer string1= new StringBuffer(s1);
        System.out.println("Reversed string : "+string1.reverse());
        System.out.println("Deleted string : "+string1.delete(4,9));
    }
}
