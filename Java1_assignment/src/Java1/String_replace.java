package Java1;

import java.util.Scanner;

public class String_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your main string: \n");
        String s1= sc.nextLine();
        System.out.println("Enter the substring to be changed: \n");
        String s2 = sc.nextLine();
        System.out.println("Enter the substring to be changed with: \n");
        String s3=sc.nextLine();
        if(s1.contains(s2))
        System.out.println(s1.replace(s2,s3));
        else
            System.out.println("substring not present. ");


    }
}
