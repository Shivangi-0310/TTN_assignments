package packageCollection;
// Question 8 Write a program to format date as example "21-March-2016"
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Question8 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMMM-YYYY");
        System.out.println(dateFormat.format(Calendar.getInstance().getTime()));
    }
}
