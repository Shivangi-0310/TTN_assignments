package Java2;

// 7. WAP to convert seconds into days, hours, minutes and seconds.

import java.util.Scanner;

public class SecondsConversion {

    static void secondsConversion(int seconds) {
        int days = seconds / (24 * 3600);

        seconds = seconds % (24 * 3600);
        int hours = seconds / 3600;

        seconds %= 3600;
        int minutes = seconds / 60;

        seconds %= 60;
        int seconds1 = seconds;
        System.out.println("No. of days: " + days + ", No. of hours: " + hours + ", No. of minutes: " + minutes +
                ", No. of seconds: " + seconds1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of seconds: ");
        int seconds = sc.nextInt();
        SecondsConversion.secondsConversion(seconds);

    }


}
