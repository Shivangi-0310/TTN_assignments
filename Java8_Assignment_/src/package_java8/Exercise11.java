package package_java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 11. Find average of the number inside integer list after doubling it.

public class Exercise11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Average of numbers after doubling them: "+list.stream()
                .collect(Collectors.averagingInt(e->e*2)));
        System.out.println("Average of numbers after doubling them using map: "+list.stream()
                .map(e->e*2)
                .collect(Collectors.averagingInt(e->e)));
        System.out.println(list);
    }
}
