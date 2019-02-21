package Java2;

// 2. WAP to sorting string without using string Methods?.

import java.util.Scanner;


public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be sorted: ");
        String s1 = sc.nextLine();
        char[] charArr = s1.toCharArray();
        char temp;

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != ' ')
                for (int j = i + 1; j < charArr.length; j++) {
                    if (charArr[j] == ' ') {
                        continue;
                    }
                    else {
                        if (charArr[i] > charArr[j]) {
                            temp = charArr[i];
                            charArr[i] = charArr[j];
                            charArr[j] = temp;

                        }

                    }
                }
        }
        System.out.println(String.valueOf(charArr));
    }
}
