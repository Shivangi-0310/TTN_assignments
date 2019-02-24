package packageCollection;
//Question 9 Write a program to display times in different country format.
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Question9 {
    public static void main(String[] args) {
        System.out.println("Date and time format of France: ");
        Locale locale = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(new Date());
        System.out.println(date);
        // for time --- getTimeinstance
        Locale locale1 = new Locale("fr", "FR");
        DateFormat dateFormat1 = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale1);
        String date1 = dateFormat1.format(new Date());
        System.out.println(date1);

        System.out.println("Date format in italian format: ");

        Locale locale2= new Locale("it","ch");
        DateFormat dateFormat2 = DateFormat.getDateInstance (DateFormat.FULL, locale2);
        System.out.println(""+ dateFormat2.format(new Date()));


    }
}
