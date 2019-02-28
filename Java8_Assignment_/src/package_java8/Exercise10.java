package package_java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//10.Sum all the numbers greater than 5 in the integer list.

public class Exercise10 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,54,23,4,65,2,3,1,65,3);
        System.out.println( "Sum of integers greater than 5: "+
                list.stream().filter(e-> e>5).collect(Collectors.summingInt(e->e)));;
    }
}
