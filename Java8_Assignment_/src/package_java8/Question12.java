package package_java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//12. Find the first even number in the integer list which is greater than 3.

public class Question12 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> number=list.stream().filter(e->e>3).filter(e->e%2==0).findFirst();
        if(number.isPresent())
        {
            System.out.println("First even number greater than 3 is: "+number);
        }
        else {
            System.out.println("No number is greater than 3");
        }
        
    }
}
