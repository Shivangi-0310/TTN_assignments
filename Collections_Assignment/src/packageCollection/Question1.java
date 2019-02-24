package packageCollection;
// Question 1. Write Java code to define List .
// Insert 5 floating point numbers in List, and using an iterator,
// find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Float> floatNumbers = new ArrayList<>();
        floatNumbers.add(3.99f);
        floatNumbers.add(9.21f);
        floatNumbers.add(0.99f);
        floatNumbers.add(100.991f);
        floatNumbers.add(8.94f);
        float sum = 0;
        for (Float number : floatNumbers) {
            sum += number;
        }
        System.out.println("Sum of floating point number is : " + sum);


    }


}
